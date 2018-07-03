package com.example.stanislau_bushuk.eas.Presentation.CreateAccount.Model

import com.example.stanislau_bushuk.eas.Api.PostModels.CompleteAuthModel
import com.example.stanislau_bushuk.eas.App
import com.example.stanislau_bushuk.eas.Pojo.Account
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.ViewState.CreateAccountViewState

class CreateAccountNetWorkModel {
    fun createAccount(completeAuthModel: CompleteAuthModel){
        App.component.retrofit.completeAuth(completeAuthModel).map {
            //CreateAccountViewState.CreateAccountSuccessful(Account()) //TODO : {change request}
        }

    }
}