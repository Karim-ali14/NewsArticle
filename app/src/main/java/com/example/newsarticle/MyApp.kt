package com.example.newsarticle

import android.app.Application
import com.example.newsarticle.common.util.NetworkMonitor

class MyApp:Application() {
    override fun onCreate() {
        super.onCreate()

        NetworkMonitor(this).startNetworkCallBack()
    }
}