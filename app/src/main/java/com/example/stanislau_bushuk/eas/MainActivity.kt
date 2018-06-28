package com.example.stanislau_bushuk.eas

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.stanislau_bushuk.eas.Pojo.TelephoneNumber
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Timber.e(App.component.retrofit.toString())

        App.component.retrofit.startRegistration(TelephoneNumber("asdasd")).observeOn(Schedulers.newThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe {Timber.e(it.telephoneNumber) }
//                .doOnError { Timber.e(it.message) }
//                .doOnNext{Timber.e(it.telephoneNumber)}
    }
}
