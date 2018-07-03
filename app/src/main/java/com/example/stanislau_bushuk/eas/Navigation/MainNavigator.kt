package com.example.stanislau_bushuk.eas.Navigation

import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import com.example.stanislau_bushuk.eas.Constants
import com.example.stanislau_bushuk.eas.Presentation.CreateAccount.CreateAccountFragment
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.LoginFragment
import com.example.stanislau_bushuk.eas.Presentation.RegistrationPresentation.RegistrationFragment
import ru.terrakok.cicerone.android.SupportAppNavigator
import timber.log.Timber

class MainNavigator(activity: FragmentActivity?, containerId: Int) : SupportAppNavigator(activity, containerId) {

    override fun createFragment(screenKey: String?, data: Any?): Fragment? {
        Timber.e(screenKey)
        when (screenKey) {

            Constants.LOGIN_SCREEN->{return LoginFragment()}

            Constants.REGISTRATION_SCREEN->{return RegistrationFragment()}

            Constants.CREATE_ACCOUNT_SCREEN->{return CreateAccountFragment()}
        }
        return null
    }

    override fun createActivityIntent(context: Context?, screenKey: String?, data: Any?): Intent? {
        return null
//        TODO:{add activity manager here}
    }

}