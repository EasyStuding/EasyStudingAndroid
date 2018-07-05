package com.example.stanislau_bushuk.eas.DI.Global

import com.example.stanislau_bushuk.eas.DI.Global.modules.CiceroneModule
import com.example.stanislau_bushuk.eas.DI.Global.modules.RetrofitModule
import com.example.stanislau_bushuk.eas.DI.Global.modules.RoomModule

interface GlobalComponent : RetrofitModule, CiceroneModule,RoomModule