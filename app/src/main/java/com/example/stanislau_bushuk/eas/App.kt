package com.example.stanislau_bushuk.eas

import android.app.Application
import com.example.stanislau_bushuk.eas.DI.Component
import com.example.stanislau_bushuk.eas.DI.ComponentImpl
import timber.log.Timber

class App : Application() {

    companion object {
        val component: Component by lazy { ComponentImpl()}
    }

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}