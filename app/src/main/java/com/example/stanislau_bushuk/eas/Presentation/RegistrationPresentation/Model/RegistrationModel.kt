package com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.Model

import com.example.stanislau_bushuk.eas.App
import com.example.stanislau_bushuk.eas.Constants

class RegistrationModel {

    fun goToCreateLoginAndPassword() {
        App.component.cicerone.router.replaceScreen(Constants.CREATE_ACCOUNT_SCREEN)
    }
}