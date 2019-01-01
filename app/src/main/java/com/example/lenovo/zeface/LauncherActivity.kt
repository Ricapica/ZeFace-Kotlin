package com.example.lenovo.zeface

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LauncherActivity : AppCompatActivity() {

private var isUserLoggedIn:Boolean?=null
private var sharedPrefs:Prefs?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)


        sharedPrefs=Prefs(this)
        isUserLoggedIn = sharedPrefs!!.isUserLoggedIn

        if(isUserLoggedIn!!)
        {

        }else{

        }

    }
}
