package com.example.stanislau_bushuk.eas.DI.Global

import com.example.stanislau_bushuk.eas.DI.Global.GlobalComponent
import com.example.stanislau_bushuk.eas.DI.Global.modules.CiceroneModule
import com.example.stanislau_bushuk.eas.DI.Global.modules.RetrofitModule
import com.example.stanislau_bushuk.eas.DI.Global.modulesImpl.CiceroneModuleImpl
import com.example.stanislau_bushuk.eas.DI.Global.modulesImpl.RetrofitModuleImpl

class GlobalComponentImpl : GlobalComponent,
        RetrofitModule by RetrofitModuleImpl(),
        CiceroneModule by CiceroneModuleImpl()