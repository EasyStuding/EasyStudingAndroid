package com.example.stanislau_bushuk.eas

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.stanislau_bushuk.eas.Navigation.MainNavigator
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class MainActivity : AppCompatActivity() {

    private val router: Router=App.component.cicerone.router
    private val navigatorHolder:NavigatorHolder = App.component.cicerone.navigatorHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState==null) {
            router.replaceScreen(Constants.LOGIN_SCREEN)
        }
    }

    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(MainNavigator(this,R.id.main_container))
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}
