package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState

import com.example.stanislau_bushuk.eas.Pojo.User

sealed class LoginViewState {
    data class AuthSuccessful(val user: User) : LoginViewState()
    data class AuthorizeError(val errorMessage: String) : LoginViewState()
    data class LoginText(val login: String) : LoginViewState()
}