package com.example.stanislau_bushuk.eas.DI.Global.modules

import com.example.stanislau_bushuk.eas.AppDatabase

interface RoomModule {
    val room: AppDatabase
}