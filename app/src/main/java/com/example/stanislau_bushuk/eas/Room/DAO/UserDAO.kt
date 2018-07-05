package com.example.stanislau_bushuk.eas.Room.DAO

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.stanislau_bushuk.eas.Room.Entitiys.UserMe

@Dao
interface UserDAO {

    @Insert
    fun insertUser(user:UserMe)

    @Query("SELECT * FROM UserMe")
    fun getUser():UserMe
}