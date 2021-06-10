package com.example.newsarticle.common.extension

import android.content.Context
import android.content.Intent
import com.example.newsarticle.common.util.Constants

fun Context.sendConnectionBack(){
    Intent(Constants.Actions.CONNECTION_BACK).also { sendBroadcast(it) }
}

fun Context.sendConnectionLost(){
    Intent(Constants.Actions.CONNECTION_LOST).also { sendBroadcast(it) }
}