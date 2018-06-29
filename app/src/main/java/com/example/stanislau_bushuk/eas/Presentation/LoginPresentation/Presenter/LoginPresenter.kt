package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Presenter

import com.example.stanislau_bushuk.eas.DI.Login.LoginComponent
import com.example.stanislau_bushuk.eas.DI.Login.LoginComponentImpl
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Model.LoginNetWorkModel
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.View.LoginView
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import com.hannesdorfmann.mosby3.mvi.MviBasePresenter

class LoginPresenter : MviBasePresenter<LoginView, LoginViewState>() {

    private val loginComponent : LoginComponent by lazy { LoginComponentImpl() }

    override fun bindIntents() {
        //TODO :{bind intent login component}
    }

}