package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.stanislau_bushuk.eas.R

class RegistrationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    //TODO: {create presenter,viewstate,view for register, bind intent,bind presenter, extends mvifragment}

}
