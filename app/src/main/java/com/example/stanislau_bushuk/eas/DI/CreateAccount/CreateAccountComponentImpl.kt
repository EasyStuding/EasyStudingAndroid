package com.example.stanislau_bushuk.eas.DI.CreateAccount

import com.example.stanislau_bushuk.eas.DI.CreateAccount.modules.CreateAccountNetWorkModule
import com.example.stanislau_bushuk.eas.DI.CreateAccount.modulesImpl.CreateAccountNetWorkModuleImpl

class CreateAccountComponentImpl : CreateAccountComponent,
        CreateAccountNetWorkModule by CreateAccountNetWorkModuleImpl()