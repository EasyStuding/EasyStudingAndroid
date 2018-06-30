package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stanislau_bushuk.eas.Pojo.AuthModel
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Presenter.LoginPresenter
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.View.LoginView
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import com.example.stanislau_bushuk.eas.R
import com.hannesdorfmann.mosby3.mvi.MviFragment
import com.jakewharton.rxbinding2.view.clicks
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : MviFragment<LoginView, LoginPresenter>(), LoginView {

    override fun registration(): Observable<Unit> = login_screen_register.clicks()

    override fun render(state: LoginViewState) {
        when (state) {
            is LoginViewState.AuthorizeError -> {
            }
        }
    }

    override fun createPresenter() = LoginPresenter()


    override fun authorization(): Observable<AuthModel> = login_screen_auth_button.clicks().switchMap {
        Observable
                .just(AuthModel(login_screen_login.text.toString(), login_screen_password.text.toString()))
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login_screen_main.requestFocus()
    }
}
