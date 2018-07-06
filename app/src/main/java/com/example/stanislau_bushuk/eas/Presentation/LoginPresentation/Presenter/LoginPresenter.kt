package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Presenter

import com.example.stanislau_bushuk.eas.DI.Login.LoginComponent
import com.example.stanislau_bushuk.eas.DI.Login.LoginComponentImpl
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.View.LoginView
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import com.hannesdorfmann.mosby3.mvi.MviBasePresenter
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class LoginPresenter : MviBasePresenter<LoginView, LoginViewState>() {

    private val loginComponent: LoginComponent by lazy { LoginComponentImpl() }

    override fun bindIntents() {
        val authState: Observable<LoginViewState> = intent(LoginView::authorization)
                .observeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())
                .switchMap { loginComponent.loginNetWorkModel.authorize(it.login, it.password) }
                .observeOn(AndroidSchedulers.mainThread())
               // .doOnNext { loginComponent.loginModel.goToRegistration() }

        val registration: Observable<LoginViewState> = intent(LoginView::registration)
                .observeOn(AndroidSchedulers.mainThread())
                .switchMap { loginComponent.loginModel.goToRegistration() }

        val loginStateObservable: Observable<LoginViewState> = Observable
                .merge(authState, registration)

        subscribeViewState(loginStateObservable, LoginView::render)

    }


}