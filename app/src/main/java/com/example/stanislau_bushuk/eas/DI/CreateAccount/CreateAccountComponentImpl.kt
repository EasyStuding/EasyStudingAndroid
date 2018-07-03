package com.example.stanislau_bushuk.eas.DI.CreateAccount

import com.example.stanislau_bushuk.eas.DI.CreateAccount.modules.CreateAccountNetWorkModule

class CreateAccountComponentImpl : CreateAccountComponent,
        CreateAccountNetWorkModule by CreateAccountComponentImpl()