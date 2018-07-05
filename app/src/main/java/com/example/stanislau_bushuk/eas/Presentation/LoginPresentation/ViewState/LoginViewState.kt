package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState

import com.example.stanislau_bushuk.eas.Room.Entitiys.UserMe

sealed class LoginViewState {
    data class AuthNavigateNext(val unit: Unit):LoginViewState()
    data class AuthSuccessful(val user: UserMe) : LoginViewState()
    data class AuthorizeError(val error: Throwable) : LoginViewState()
}