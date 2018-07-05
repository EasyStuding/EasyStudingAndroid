package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.ViewState

import com.example.stanislau_bushuk.eas.Room.Entitiys.UserMe

sealed class RegistrationViewState {

    object Loading : RegistrationViewState()

    data class SendSMSSuccessful(val user: UserMe) : RegistrationViewState()

    data class ValidateSMSSuccessful(val user: UserMe) : RegistrationViewState()

    data class SendSMSError(val error: Throwable) : RegistrationViewState()

    data class ValidateSMSError(val error:Throwable) : RegistrationViewState()

}