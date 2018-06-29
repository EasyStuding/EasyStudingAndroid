package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Model

import com.example.stanislau_bushuk.eas.Api.IApi
import com.example.stanislau_bushuk.eas.App

class LoginNetWorkModel {
    val iApi : IApi = App.component.retrofit

    fun authorize(login : String, password : String ){
        //TODO: {add logic for auth}
    }

}