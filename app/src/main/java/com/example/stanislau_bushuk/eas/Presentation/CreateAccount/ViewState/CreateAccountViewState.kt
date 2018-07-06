package com.example.stanislau_bushuk.eas.Presentation.CreateAccount.ViewState

import com.example.stanislau_bushuk.eas.Room.Entitiys.Account

sealed class CreateAccountViewState {

    object Loading : CreateAccountViewState()

    data class CreateAccountSuccessful(val account : Account):CreateAccountViewState()

    data class CreateAccountError(val error : Throwable):CreateAccountViewState()
}