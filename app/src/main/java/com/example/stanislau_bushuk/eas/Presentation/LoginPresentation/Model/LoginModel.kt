package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Model

import com.example.stanislau_bushuk.eas.App
import com.example.stanislau_bushuk.eas.Constants
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import io.reactivex.Observable
import ru.terrakok.cicerone.result.ResultListener

class LoginModel {

    fun goToRegistration(): Observable<LoginViewState> = Observable.just(App.component.cicerone
            .router.navigateTo(Constants.REGISTRATION_SCREEN)).map<LoginViewState> {
            LoginViewState.AuthNavigateNext(Unit)
    }
}