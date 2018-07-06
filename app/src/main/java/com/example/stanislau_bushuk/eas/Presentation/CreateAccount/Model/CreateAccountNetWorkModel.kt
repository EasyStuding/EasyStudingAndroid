package com.example.stanislau_bushuk.eas.Presentation.CreateAccount.Model

import com.example.stanislau_bushuk.eas.Api.PostModels.CompleteAuthModel
import com.example.stanislau_bushuk.eas.App
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.ViewState.CreateAccountViewState
import io.reactivex.Observable
import timber.log.Timber

class CreateAccountNetWorkModel {

    fun createAccount(authModel: CompleteAuthModel): Observable<CreateAccountViewState> {
        Timber.e(App.component.room.userDao().getUser().telephoneNumber)
        return App.component.retrofit.completeAuth(CompleteAuthModel(App.component.room.userDao().getUser().telephoneNumber.toString(), authModel.password))
                .map<CreateAccountViewState> { CreateAccountViewState.CreateAccountSuccessful(it) }
                .onErrorReturn { CreateAccountViewState.CreateAccountError(it) }
    }
}