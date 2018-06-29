package com.example.stanislau_bushuk.eas.DI.Login.modulesImpl

import com.example.stanislau_bushuk.eas.DI.Login.modules.LoginNetworkModule
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Model.LoginNetWorkModel

class LoginNetworkModuleIml : LoginNetworkModule {
    override val loginNetWorkModel: LoginNetWorkModel = LoginNetWorkModel()
}