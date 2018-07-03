package com.example.stanislau_bushuk.eas.Presentation.CreateAccount.View

import com.example.stanislau_bushuk.eas.Api.PostModels.CompleteAuthModel
import com.hannesdorfmann.mosby3.mvp.MvpView
import io.reactivex.Observable

interface CreateAccountView : MvpView {

    fun createAccount(): Observable<CompleteAuthModel>

}