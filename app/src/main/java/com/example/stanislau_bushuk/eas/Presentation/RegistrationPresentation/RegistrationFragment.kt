package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.style.MaskFilterSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.stanislau_bushuk.eas.R
import kotlinx.android.synthetic.main.fragment_registration.*

class RegistrationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    //TODO: {create presenter,viewstate,view for register, bind intent,bind presenter, extends mvifragment}

}
