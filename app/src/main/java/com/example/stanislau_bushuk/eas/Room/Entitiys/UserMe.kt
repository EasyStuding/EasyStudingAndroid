package com.example.stanislau_bushuk.eas.Room.Entitiys

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import com.example.stanislau_bushuk.eas.Room.DatabaseFields
import com.example.stanislau_bushuk.eas.Room.Utils.DateConverter
import java.util.*

@Entity
@TypeConverters(DateConverter::class)
data class UserMe(

        var id: Int,

        @PrimaryKey
        @ColumnInfo(name = DatabaseFields.TELEPHONE_NUBMER)
        var telephoneNumber: String,

        var telephoneNumberIsValidated: Boolean,

        @ColumnInfo(name = DatabaseFields.EMAIL)
        var email: String?,

        var emailIsValidated: Boolean,

        @ColumnInfo(name = DatabaseFields.FULL_NAME)
        var fullName: String?,

        @ColumnInfo(name = DatabaseFields.DESCRIPTION)
        var description: String?,

        @ColumnInfo(name = DatabaseFields.PICTURE_LINK)
        var pictureLink: String?,

        @ColumnInfo(name = DatabaseFields.ROLE)
        var role: String,

        @ColumnInfo(name = DatabaseFields.COUNTRY)
        var country: String?,

        @ColumnInfo(name = DatabaseFields.REGION)
        var region: String?,

        @ColumnInfo(name = DatabaseFields.CITY)
        var city: String?,

        @ColumnInfo(name = DatabaseFields.EDUCATION)
        var education: String?,

        var userIsGaranted: Boolean,

        @ColumnInfo(name = DatabaseFields.RAITING)
        var raiting: Float,

        var registrationDate: Date = Date(),

        var banExpiresDate: Date = Date(),

        var subscriptionExecutorExpiresDate: Date = Date(),

        var subscriptionOpenSourceExpiresDate: Date = Date()


)


