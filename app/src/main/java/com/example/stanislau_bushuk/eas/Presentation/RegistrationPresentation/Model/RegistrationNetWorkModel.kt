package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.Model

import com.example.stanislau_bushuk.eas.Api.PostModels.TelephoneNumber
import com.example.stanislau_bushuk.eas.Api.PostModels.ValidateSMSModel
import com.example.stanislau_bushuk.eas.App
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.ViewState.RegistrationViewState
import io.reactivex.Observable

class RegistrationNetWorkModel {

    fun sendSMS(phoneNumber: TelephoneNumber): Observable<RegistrationViewState> {
        return App.component.retrofit.startRegistration(phoneNumber)
                .map<RegistrationViewState> { RegistrationViewState.SendSMSSuccessful(it) }
                .startWith(RegistrationViewState.Loading)
                .onErrorReturn { RegistrationViewState.SendSMSError(it) }
    }

    fun validateSMS(validateSMS: ValidateSMSModel): Observable<RegistrationViewState> {
        return App.component.retrofit.validateRegistration(validateSMS)
                .map<RegistrationViewState> { RegistrationViewState.ValidateSMSSuccessful(it) }
                .onErrorReturn { RegistrationViewState.ValidateSMSError(it) }
    }

}