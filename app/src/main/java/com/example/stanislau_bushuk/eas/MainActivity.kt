package com.example.stanislau_bushuk.eas

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.stanislau_bushuk.eas.Navigation.MainNavigator
import com.example.stanislau_bushuk.eas.Pojo.TelephoneNumber
import io.reactivex.schedulers.Schedulers
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val router: Router=App.component.cicerone.router
    private val navigatorHolder:NavigatorHolder = App.component.cicerone.navigatorHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        router.replaceScreen(Constants.LOGIN_SCREEN)
//        App.component.retrofit.startRegistration(TelephoneNumber("asdasd")).observeOn(Schedulers.newThread())
//                .subscribeOn(Schedulers.newThread())
//                .subscribe {Timber.e(it.telephoneNumber) }
//                .doOnError { Timber.e(it.message) }
//                .doOnNext{Timber.e(it.telephoneNumber)}
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
