package com.example.stanislau_bushuk.eas.DI.modules

import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

interface CiceroneModule {
    var cicerone: Cicerone<Router>

    fun provideRouter() : Router

    fun provideHolder():NavigatorHolder
}