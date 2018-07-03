package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.View

import com.example.stanislau_bushuk.eas.Api.PostModels.TelephoneNumber
import com.example.stanislau_bushuk.eas.Api.PostModels.ValidateSMSModel
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.ViewState.RegistrationViewState
import com.hannesdorfmann.mosby3.mvp.MvpView
import io.reactivex.Observable

interface RegistrationView : MvpView {

    fun sendSMS():Observable<TelephoneNumber>

    fun validateSMS():Observable<String>

    fun render(state: RegistrationViewState)
}