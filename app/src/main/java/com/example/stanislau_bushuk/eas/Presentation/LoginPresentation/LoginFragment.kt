package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Presenter.LoginPresenter
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.View.LoginView

import com.example.stanislau_bushuk.eas.R
import com.hannesdorfmann.mosby3.mvi.MviFragment

class LoginFragment : MviFragment<LoginView,LoginPresenter>() {

    override fun createPresenter(): LoginPresenter {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }


}
