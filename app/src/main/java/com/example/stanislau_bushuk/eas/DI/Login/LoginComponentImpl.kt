package com.example.stanislau_bushuk.eas.DI.Login

import com.example.stanislau_bushuk.eas.DI.Login.modules.LoginModule
import com.example.stanislau_bushuk.eas.DI.Login.modules.LoginNetworkModule
import com.example.stanislau_bushuk.eas.DI.Login.modulesImpl.LoginModuleIml
import com.example.stanislau_bushuk.eas.DI.Login.modulesImpl.LoginNetworkModuleIml

class LoginComponentImpl : LoginComponent,
        LoginNetworkModule by LoginNetworkModuleIml(),
        LoginModule by LoginModuleIml()
