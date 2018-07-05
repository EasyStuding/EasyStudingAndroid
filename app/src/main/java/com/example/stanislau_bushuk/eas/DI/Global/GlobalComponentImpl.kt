package com.example.stanislau_bushuk.eas.DI.Global

import android.content.Context
import com.example.stanislau_bushuk.eas.DI.Global.modules.CiceroneModule
import com.example.stanislau_bushuk.eas.DI.Global.modules.RetrofitModule
import com.example.stanislau_bushuk.eas.DI.Global.modules.RoomModule
import com.example.stanislau_bushuk.eas.DI.Global.modulesImpl.CiceroneModuleImpl
import com.example.stanislau_bushuk.eas.DI.Global.modulesImpl.RetrofitModuleImpl
import com.example.stanislau_bushuk.eas.DI.Global.modulesImpl.RoomModuleImpl

class GlobalComponentImpl(application: Context) : GlobalComponent,
        RetrofitModule by RetrofitModuleImpl(),
        CiceroneModule by CiceroneModuleImpl(),
        RoomModule by RoomModuleImpl(application)