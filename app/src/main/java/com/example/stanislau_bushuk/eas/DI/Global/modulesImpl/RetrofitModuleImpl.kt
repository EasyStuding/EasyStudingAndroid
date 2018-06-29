package com.example.stanislau_bushuk.eas.DI.Global.modulesImpl

import com.example.stanislau_bushuk.eas.Api.IApi
import com.example.stanislau_bushuk.eas.DI.Global.modules.RetrofitModule
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitModuleImpl :  RetrofitModule{
    override val retrofit = Retrofit.Builder()
            .baseUrl("http://easystudingapi20180626065507.azurewebsites.net/api/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(IApi::class.java) as IApi
}