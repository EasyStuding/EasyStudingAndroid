package com.example.stanislau_bushuk.eas.Pojo

import java.util.*


data class User(var id: Int,
                var telephoneNumber: String,
                var telephoneNumberIsValidated: Boolean,
                var email: String,
                var emailIsValidated: Boolean,
                var fullName: String,
                var description: String,
                var pictureLink: String,
                var role: String,
                var country: String,
                var region: String,
                var city: String,
                var education: String,
                var userIsGaranted: Boolean,
                var raiting: Float,
                var registrationDate: Date,
                var banExpiresDate: Date,
                var subscriptionExecutorExpiresDate: Date,
                var subscriptionOpenSourceExpiresDate: Date)