package com.example.stanislau_bushuk.eas.Api

import com.example.stanislau_bushuk.eas.Api.PostModels.AuthModel
import com.example.stanislau_bushuk.eas.Api.PostModels.CompleteAuthModel
import com.example.stanislau_bushuk.eas.Api.PostModels.TelephoneNumber
import com.example.stanislau_bushuk.eas.Api.PostModels.ValidateSMSModel
import com.example.stanislau_bushuk.eas.Room.Entitiys.UserMe
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface IApi {

    @POST("session/StartRegistration/")
    fun startRegistration(@Body telephoneNumber: TelephoneNumber): Observable<UserMe>

    @POST("session/ValidateRegistration/")
    fun validateRegistration(@Body validateModel: ValidateSMSModel): Observable<UserMe>

    @POST("session/CompleteRegistration/")
    fun completeAuth(@Body authModel: CompleteAuthModel): Observable<UserMe>

    @POST("/session/Login/")
    fun authorization(@Body authModel: AuthModel): Observable<UserMe>

}