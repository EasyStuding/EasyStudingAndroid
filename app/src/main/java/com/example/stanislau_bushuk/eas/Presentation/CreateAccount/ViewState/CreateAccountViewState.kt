package com.example.stanislau_bushuk.eas.Presentation.CreateAccount.ViewState

import com.example.stanislau_bushuk.eas.Pojo.Account

sealed class CreateAccountViewState {

    object Loading : CreateAccountViewState()

    data class CreateAccountSuccessful(val account : Account)

    data class CreateAccountError(val error : Throwable)
}