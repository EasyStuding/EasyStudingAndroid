package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Model

import com.example.stanislau_bushuk.eas.Api.IApi
import com.example.stanislau_bushuk.eas.Api.PostModels.TelephoneNumber
import com.example.stanislau_bushuk.eas.App
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import io.reactivex.Observable

class LoginNetWorkModel {
    private val iApi: IApi = App.component.retrofit

    fun authorize(login: String, password: String): Observable<LoginViewState> {

        return iApi.startRegistration(TelephoneNumber("123"))//TODO:{change request}
                .map<LoginViewState> { LoginViewState.AuthSuccessful(it) }
                .onErrorReturn { LoginViewState.AuthorizeError(it) }
                //.doOnNext { } //TODO:{add to ORM}

    }
}