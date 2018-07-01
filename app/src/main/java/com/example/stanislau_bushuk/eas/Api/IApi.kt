package com.example.stanislau_bushuk.eas.Api

import com.example.stanislau_bushuk.eas.Api.PostModels.TelephoneNumber
import com.example.stanislau_bushuk.eas.Api.PostModels.ValidateModel
import com.example.stanislau_bushuk.eas.Pojo.User
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface IApi {

    @POST("session/StartRegistration/")
    fun startRegistration(@Body telephoneNumber: TelephoneNumber): Observable<User>

    @POST("session/ValidateRegistration/")
    fun validateRegistration(@Body validateModel: ValidateModel): Observable<User>

    @POST("session/CompleteRegistration/")
    fun completeAuth(@Body validateModel: ValidateModel): Observable<User>

}