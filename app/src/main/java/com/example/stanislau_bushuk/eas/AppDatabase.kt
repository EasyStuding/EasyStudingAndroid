package com.example.stanislau_bushuk.eas

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.stanislau_bushuk.eas.Room.DAO.UserDAO
import com.example.stanislau_bushuk.eas.Room.Entitiys.UserMe


@Database(entities = [(UserMe::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDAO
}