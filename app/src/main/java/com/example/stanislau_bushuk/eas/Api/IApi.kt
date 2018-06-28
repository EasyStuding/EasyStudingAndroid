package com.example.stanislau_bushuk.eas.Api

import com.example.stanislau_bushuk.eas.Pojo.TelephoneNumber
import com.example.stanislau_bushuk.eas.Pojo.User
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface IApi {

    @POST("session/StartRegistration/")
    fun startRegistration(@Body telephoneNumber: TelephoneNumber): Observable<User>
}