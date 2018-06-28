package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState

sealed class LoginViewState {
    object LoadingState : LoginViewState()
    data class StartRegistrationComplete(val id : Int, val telephoneNumber: String)
    data class StartRegistrationError(val errorMessage : String)
}