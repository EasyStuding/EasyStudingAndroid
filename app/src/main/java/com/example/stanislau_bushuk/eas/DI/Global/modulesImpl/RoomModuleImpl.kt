package com.example.stanislau_bushuk.eas.DI.Global.modulesImpl

import android.arch.persistence.room.Room
import android.content.Context
import com.example.stanislau_bushuk.eas.AppDatabase
import com.example.stanislau_bushuk.eas.DI.Global.modules.RoomModule

class RoomModuleImpl(context: Context) : RoomModule {
    override val room = Room.databaseBuilder(context, AppDatabase::class.java, "database")
            .build()
}