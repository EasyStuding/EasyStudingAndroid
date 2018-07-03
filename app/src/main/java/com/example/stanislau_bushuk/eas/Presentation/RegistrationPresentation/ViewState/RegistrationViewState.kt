package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.ViewState

import com.example.stanislau_bushuk.eas.Pojo.User

sealed class RegistrationViewState {

    object Loading : RegistrationViewState()

    data class SendSMSSuccessful(val user: User) : RegistrationViewState()

    data class ValidateSMSSuccessful(val user: User) : RegistrationViewState()

    data class SendSMSError(val error: Throwable) : RegistrationViewState()

    data class ValidateSMSError(val error:Throwable) : RegistrationViewState()

}