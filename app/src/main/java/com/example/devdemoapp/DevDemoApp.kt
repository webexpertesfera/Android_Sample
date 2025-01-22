package com.example.devdemoapp

import android.app.Application
import android.content.IntentFilter
import android.util.Log
import com.example.devdemoapp.utils.NetworkChangeReceiver
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltAndroidApp
class DevDemoApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        //Internet connection BroadCast Receiver
        val filter = IntentFilter()
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE")
        registerReceiver(NetworkChangeReceiver(), filter)
    }

    companion object {
        const val TAG = "DevDemoApp"
        lateinit var instance: DevDemoApp
    }
}