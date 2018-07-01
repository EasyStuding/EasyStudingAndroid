package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Model

import com.example.stanislau_bushuk.eas.Api.IApi
import com.example.stanislau_bushuk.eas.App
import com.example.stanislau_bushuk.eas.Api.PostModels.TelephoneNumber
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers

class LoginNetWorkModel {
    private val iApi: IApi = App.component.retrofit

    fun authorize(login: String, password: String): Observable<LoginViewState> {

        return iApi.startRegistration(TelephoneNumber("123"))//TODO:{change request}
                .observeOn(Schedulers.io())
                .subscribeOn(Schedulers.io())
                .doOnNext { } //TODO:{add to ORM}
                .map { LoginViewState.AuthSuccessful(it) }
    }
}