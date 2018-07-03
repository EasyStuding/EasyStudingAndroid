package com.example.stanislau_bushuk.eas.Presentation.CreateAccount


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.Presenters.CreateAccountPresenter
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.View.CreateAccountView
import com.example.stanislau_bushuk.eas.R
import com.hannesdorfmann.mosby3.mvi.MviFragment


class CreateAccountFragment : MviFragment<CreateAccountView,CreateAccountPresenter>() {

    override fun createPresenter(): CreateAccountPresenter = CreateAccountPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_account, container, false)
    }


}
