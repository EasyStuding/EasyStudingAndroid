package com.example.stanislau_bushuk.eas.Room.Entitiys

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Account(

        @PrimaryKey
        val id: Int,

        val telephoneNumber: String,

        val role: String,

        @ColumnInfo
        val accessToken: String)