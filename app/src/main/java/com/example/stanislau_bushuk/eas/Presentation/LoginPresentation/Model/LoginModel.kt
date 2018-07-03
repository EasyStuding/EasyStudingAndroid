package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Model

import com.example.stanislau_bushuk.eas.App
import com.example.stanislau_bushuk.eas.Constants
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import io.reactivex.Observable
import ru.terrakok.cicerone.result.ResultListener

class LoginModel : ResultListener {

    override fun onResult(resultData: Any?) {
        //TODO {add result go to main Screen}
    }

    fun goToRegistration(): Observable<LoginViewState> {
        App.component.cicerone.router.setResultListener(Constants.REGISTRATION_SUCCESSFUL, this)
        App.component.cicerone.router.navigateTo(Constants.REGISTRATION_SCREEN)
        return Observable.create { }
    }
}