package com.example.newsarticle.common.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkRequest
import com.example.newsarticle.common.extension.sendConnectionBack
import com.example.newsarticle.common.extension.sendConnectionLost

class NetworkMonitor(private val context: Context) {

    fun startNetworkCallBack(){
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val builder = NetworkRequest.Builder()

        connectivityManager.registerNetworkCallback(builder.build(), object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                super.onAvailable(network)
                context.sendConnectionBack()
            }

            override fun onLost(network: Network) {
                super.onLost(network)
                context.sendConnectionLost()
            }
        })
    }

}