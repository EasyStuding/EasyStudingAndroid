package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.Presenter

import com.example.stanislau_bushuk.eas.Api.PostModels.ValidateSMSModel
import com.example.stanislau_bushuk.eas.DI.Registration.RegistrationComponent
import com.example.stanislau_bushuk.eas.DI.Registration.RegistrationComponentImpl
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.View.RegistrationView
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.ViewState.RegistrationViewState
import com.hannesdorfmann.mosby3.mvi.MviBasePresenter
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RegistrationPresenter : MviBasePresenter<RegistrationView, RegistrationViewState>() {

    private val registrationComponent: RegistrationComponent by lazy { RegistrationComponentImpl() }

    override fun bindIntents() {

        val startRegistration: Observable<RegistrationViewState> = intent(RegistrationView::sendSMS)
                .observeOn(Schedulers.io())
                .switchMap { registrationComponent.registrationNetWorkModel.sendSMS(it) }
                .observeOn(AndroidSchedulers.mainThread())

        val validateSMS: Observable<RegistrationViewState> = intent(RegistrationView::validateSMS)
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .switchMap { registrationComponent.registrationNetWorkModel.validateSMS(ValidateSMSModel(16, it.toInt())) }
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext { registrationComponent.registrationModel.goToCreateLoginAndPassword() }


        val observable: Observable<RegistrationViewState> = Observable.merge(startRegistration, validateSMS)

        subscribeViewState(observable, RegistrationView::render)
    }
}