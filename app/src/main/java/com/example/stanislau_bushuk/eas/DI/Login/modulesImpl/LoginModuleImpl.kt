package com.example.stanislau_bushuk.eas.DI.Login.modulesImpl

import com.example.stanislau_bushuk.eas.DI.Login.modules.LoginModule
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Model.LoginModel

class LoginModuleImpl : LoginModule {
    override val loginModel: LoginModel = LoginModel()
}