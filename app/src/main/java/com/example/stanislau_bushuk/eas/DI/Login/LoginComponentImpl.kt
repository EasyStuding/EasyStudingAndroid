package com.example.stanislau_bushuk.eas.DI.Login

import com.example.stanislau_bushuk.eas.DI.Login.modules.LoginModule
import com.example.stanislau_bushuk.eas.DI.Login.modules.LoginNetworkModule
import com.example.stanislau_bushuk.eas.DI.Login.modulesImpl.LoginModuleImpl
import com.example.stanislau_bushuk.eas.DI.Login.modulesImpl.LoginNetworkModuleImpl

class LoginComponentImpl : LoginComponent,
        LoginNetworkModule by LoginNetworkModuleImpl(),
        LoginModule by LoginModuleImpl()
