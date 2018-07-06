package com.example.stanislau_bushuk.eas.Presentation.LoginPresentation


import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stanislau_bushuk.eas.Api.PostModels.AuthModel
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.Presenter.LoginPresenter
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.View.LoginView
import com.example.stanislau_bushuk.eas.Presentation.LoginPresentation.ViewState.LoginViewState
import com.example.stanislau_bushuk.eas.R
import com.example.stanislau_bushuk.eas.ServerErrors
import com.hannesdorfmann.mosby3.mvi.MviFragment
import com.jakewharton.rxbinding2.view.clicks
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_login.*
import timber.log.Timber

class LoginFragment : MviFragment<LoginView, LoginPresenter>(), LoginView {

    override fun registration(): Observable<Unit> = login_screen_register.clicks()

    override fun render(state: LoginViewState) {
        when (state) {
            is LoginViewState.AuthorizeError -> {
                Timber.e(state.error.message.toString())
                catchErrors(state.error.message.toString())
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

    private fun catchErrors(error: String) {
        when (error) {

            ServerErrors.TIMEOUT -> {
                Snackbar.make(login_screen_auth_button,R.string.server_error_timeout,Snackbar.LENGTH_LONG)
            }

            ServerErrors.BAD_REQUEST -> {
                Snackbar.make(login_screen_auth_button,"XUI",Snackbar.LENGTH_LONG)
            }

            ServerErrors.NOT_FOUND ->{
                Snackbar.make(login_screen_auth_button,"Incorrect login or password",Snackbar.LENGTH_LONG)
            }

        }
    }

}
