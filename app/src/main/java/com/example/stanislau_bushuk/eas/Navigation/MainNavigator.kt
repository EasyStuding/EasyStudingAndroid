package com.example.stanislau_bushuk.eas.Navigation

import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import com.example.stanislau_bushuk.eas.Constants
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.LoginFragment
import ru.terrakok.cicerone.android.SupportAppNavigator

class MainNavigator(activity: FragmentActivity?, containerId: Int) : SupportAppNavigator(activity, containerId) {

    override fun createFragment(screenKey: String?, data: Any?): Fragment {

        when (screenKey) {
            Constants.LOGIN_SCREEN->{return LoginFragment()}
        }
        TODO("add defoult exit") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createActivityIntent(context: Context?, screenKey: String?, data: Any?): Intent? {
        return null
//        TODO:{add activity manager here}
    }

}