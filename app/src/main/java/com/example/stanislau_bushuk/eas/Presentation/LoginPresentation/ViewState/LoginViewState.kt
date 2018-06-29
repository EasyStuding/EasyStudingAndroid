package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState

sealed class LoginViewState {
    object LoadingState : LoginViewState()
    data class authorize(val login : String, val password: String)
    data class authorizeError(val errorMessage : String)
}