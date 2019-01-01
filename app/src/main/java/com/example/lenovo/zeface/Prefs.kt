package com.example.lenovo.zeface

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {
    private var sharedPreferences: SharedPreferences?=null
    var isUserLoggedIn: Boolean? = null


    init{

        sharedPreferences = context.getSharedPreferences("sharedPrefs", 0)
        isUserLoggedIn = sharedPreferences!!.getBoolean("isUserLoggedIn",false)

    }

}