package com.example.stanislau_bushuk.eas.DI.Registration.modulesIml

import com.example.stanislau_bushuk.eas.DI.Registration.modules.RegistrationNetWorkModule
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.Model.RegistrationNetWorkModel

class RegistrationNetWorkModuleImpl : RegistrationNetWorkModule {
    override val registrationNetWorkModel: RegistrationNetWorkModel = RegistrationNetWorkModel()
}