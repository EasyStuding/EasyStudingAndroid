package com.example.stanislau_bushuk.eas

import android.app.Application
import com.example.stanislau_bushuk.eas.DI.Global.GlobalComponent
import com.example.stanislau_bushuk.eas.DI.Global.GlobalComponentImpl
import timber.log.Timber

class App : Application() {

    companion object {
        val component: GlobalComponent by lazy { GlobalComponentImpl() }
    }

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}