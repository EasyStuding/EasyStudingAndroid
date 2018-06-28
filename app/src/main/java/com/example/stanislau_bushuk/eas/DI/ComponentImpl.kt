package com.example.stanislau_bushuk.eas.DI

import com.example.stanislau_bushuk.eas.DI.modules.CiceroneModule
import com.example.stanislau_bushuk.eas.DI.modules.RetrofitModule
import com.example.stanislau_bushuk.eas.DI.modulesImpl.CiceroneModuleImpl
import com.example.stanislau_bushuk.eas.DI.modulesImpl.RetrofitModuleImpl

class ComponentImpl : Component,
        RetrofitModule by RetrofitModuleImpl(),
        CiceroneModule by CiceroneModuleImpl()