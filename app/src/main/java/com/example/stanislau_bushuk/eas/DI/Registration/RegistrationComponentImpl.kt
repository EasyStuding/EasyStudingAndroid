package com.example.stanislau_bushuk.eas.DI.Registration

import com.example.stanislau_bushuk.eas.DI.Registration.modules.RegistrationModule
import com.example.stanislau_bushuk.eas.DI.Registration.modules.RegistrationNetWorkModule
import com.example.stanislau_bushuk.eas.DI.Registration.modulesIml.RegistrationModuleIml
import com.example.stanislau_bushuk.eas.DI.Registration.modulesIml.RegistrationNetWorkModuleImpl

class RegistrationComponentImpl : RegistrationComponent,
                RegistrationNetWorkModule by RegistrationNetWorkModuleImpl(),
                RegistrationModule by RegistrationModuleIml()