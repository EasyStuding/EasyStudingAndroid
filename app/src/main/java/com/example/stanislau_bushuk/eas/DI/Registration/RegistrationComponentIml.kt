package com.example.stanislau_bushuk.eas.DI.Registration

import com.example.stanislau_bushuk.eas.DI.Registration.modules.RegistrationNetWorkModule

class RegistrationComponentIml : RegistrationComponent,
                RegistrationNetWorkModule by RegistrationComponentIml()