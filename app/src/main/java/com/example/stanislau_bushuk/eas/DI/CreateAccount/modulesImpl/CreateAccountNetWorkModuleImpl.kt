package com.example.stanislau_bushuk.eas.DI.CreateAccount.modulesImpl

import com.example.stanislau_bushuk.eas.DI.CreateAccount.modules.CreateAccountNetWorkModule
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.Model.CreateAccountNetWorkModel

class CreateAccountNetWorkModuleImpl : CreateAccountNetWorkModule{
    override val createAccountNetWorkModel: CreateAccountNetWorkModel = CreateAccountNetWorkModel()
}