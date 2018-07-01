package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.Presenter.RegistrationPresenter
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.View.RegistrationView
import com.example.stanislau_bushuk.eas.R
import com.hannesdorfmann.mosby3.mvi.MviFragment

class RegistrationFragment : MviFragment<RegistrationView, RegistrationPresenter>(), RegistrationView {

    override fun createPresenter(): RegistrationPresenter = RegistrationPresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    //TODO: {create presenter,viewstate,view for register, bind intent,bind presenter, extends mvifragment}

}
