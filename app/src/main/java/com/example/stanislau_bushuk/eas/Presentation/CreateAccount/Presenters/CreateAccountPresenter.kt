package com.example.stanislau_bushuk.eas.Presentation.CreateAccount.Presenters

import com.example.stanislau_bushuk.eas.DI.CreateAccount.CreateAccountComponent
import com.example.stanislau_bushuk.eas.DI.CreateAccount.CreateAccountComponentImpl
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.View.CreateAccountView
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.ViewState.CreateAccountViewState
import com.hannesdorfmann.mosby3.mvi.MviBasePresenter
import io.reactivex.Observable

class CreateAccountPresenter : MviBasePresenter<CreateAccountView,CreateAccountViewState>() {

    val component: CreateAccountComponent by lazy { CreateAccountComponentImpl() }

    override fun bindIntents() {
//        val createAccount : Observable<CreateAccountViewState> = intent(CreateAccountView::createAccount)
//                .switchMap { component.createAccountNetWorkModel.createAccount() }
        //TODO :{create intent and subscribe}
    }
}