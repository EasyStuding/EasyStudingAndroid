package com.example.stanislau_bushuk.eas.DI.Registration.modulesIml

import com.example.stanislau_bushuk.eas.DI.Registration.modules.RegistrationModule
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.Model.RegistrationModel

class RegistrationModuleIml : RegistrationModule {
    override val registrationModel: RegistrationModel = RegistrationModel()
}