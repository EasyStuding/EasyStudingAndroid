package com.example.stanislau_bushuk.eas.Presentation.CreateAccount


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stanislau_bushuk.eas.Api.PostModels.AuthModel
import com.example.stanislau_bushuk.eas.Api.PostModels.CompleteAuthModel
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.Presenters.CreateAccountPresenter
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.View.CreateAccountView
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.ViewState.CreateAccountViewState
import com.example.stanislau_bushuk.eas.R
import com.hannesdorfmann.mosby3.mvi.MviFragment
import com.jakewharton.rxbinding2.view.clicks
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_create_account.*
import timber.log.Timber


class CreateAccountFragment : MviFragment<CreateAccountView,CreateAccountPresenter>(), CreateAccountView {

    override fun render(state: CreateAccountViewState) {
        when (state) {
            is CreateAccountViewState.CreateAccountSuccessful -> {
                Timber.e(state.account.accessToken)
            }
            is CreateAccountViewState.CreateAccountError ->{
                Timber.e(state.error.message)
            }
        }
    }


    override fun createAccount(): Observable<CompleteAuthModel> = create_account_screen_register_button
            .clicks().map { CompleteAuthModel(create_account_screen_login.text.toString(),
                    create_account_screen_password.text.toString()) }

    override fun createPresenter(): CreateAccountPresenter = CreateAccountPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_account, container, false)
    }

}
