package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.View

import com.example.stanislau_bushuk.eas.Pojo.AuthModel
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import com.hannesdorfmann.mosby3.mvp.MvpView
import io.reactivex.Observable

interface LoginView : MvpView {

    fun authorization():Observable<AuthModel>

    fun registration():Observable<Unit>

    fun render(state : LoginViewState)

}