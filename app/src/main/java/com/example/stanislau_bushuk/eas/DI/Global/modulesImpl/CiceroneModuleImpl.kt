package com.example.stanislau_bushuk.eas.DI.Global.modulesImpl

import com.example.stanislau_bushuk.eas.DI.Global.modules.CiceroneModule
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class CiceroneModuleImpl : CiceroneModule {

    override var cicerone: Cicerone<Router> = Cicerone.create()

    override fun provideRouter(): Router=cicerone.router

    override fun provideHolder(): NavigatorHolder=cicerone.navigatorHolder
}