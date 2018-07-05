package com.example.stanislau_bushuk.eas

import android.app.Application
import com.example.stanislau_bushuk.eas.DI.Global.GlobalComponent
import com.example.stanislau_bushuk.eas.DI.Global.GlobalComponentImpl
import timber.log.Timber

class App : Application() {


    companion object {
        lateinit var component: GlobalComponent
    }


    override fun onCreate() {
        super.onCreate()
        component = GlobalComponentImpl(applicationContext)

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}