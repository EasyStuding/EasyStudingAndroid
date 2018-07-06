package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stanislau_bushuk.eas.Api.PostModels.TelephoneNumber
import com.example.stanislau_bushuk.eas.Constants
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.Presenter.RegistrationPresenter
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.View.RegistrationView
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.ViewState.RegistrationViewState
import com.example.stanislau_bushuk.eas.R
import com.hannesdorfmann.mosby3.mvi.MviFragment
import com.jakewharton.rxbinding2.view.clicks
import com.jakewharton.rxbinding2.widget.textChanges
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_registration.*
import timber.log.Timber

class RegistrationFragment : MviFragment<RegistrationView, RegistrationPresenter>(), RegistrationView {

    override fun validateSMS(): Observable<String> = registration_screen_verification_number
            .textChanges().map { it.toString() }
            .filter { it -> it.length == Constants.VALIDATE_CODE_LENGTH }

    override fun sendSMS(): Observable<TelephoneNumber> = registration_screen_verification_button.clicks().switchMap {
        Observable.just(TelephoneNumber("+"+registration_screen_telephone.unmaskedText.toString()))
    }

    override fun render(state: RegistrationViewState) {
        when (state) {

            is RegistrationViewState.Loading -> {
                registration_screen_verification_button.isClickable = false
            }

            is RegistrationViewState.SendSMSSuccessful -> {
                Timber.e("MESSAGE RECEIVE")
                registration_screen_telephone.visibility = View.GONE
                registration_screen_verification_button.visibility = View.GONE
                registration_screen_verification_number.visibility = View.VISIBLE
            }

            is RegistrationViewState.ValidateSMSSuccessful -> {
                registration_screen_verification_number.setText("")
            }

            is RegistrationViewState.SendSMSError -> {
                Timber.e(state.error.message)
                registration_screen_verification_button.isClickable = true
            }

        }
    }

    override fun createPresenter(): RegistrationPresenter = RegistrationPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_registration, container, false)
    }


}
