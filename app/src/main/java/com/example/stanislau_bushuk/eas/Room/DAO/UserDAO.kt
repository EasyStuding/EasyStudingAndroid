package com.example.stanislau_bushuk.eas.Room.DAO

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update
import com.example.stanislau_bushuk.eas.Room.Entitiys.UserMe

@Dao
interface UserDAO {

    @Update
    fun insertUser(user: UserMe)

    @Query("SELECT * FROM UserMe")
    fun getUser(): UserMe

}