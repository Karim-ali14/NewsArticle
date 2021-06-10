package com.example.newsarticle.common.extension

import android.app.Activity
import android.widget.Toast
import com.example.newsarticle.R

/////////////////////////////////////////////////////////////////////////
// No Connection
/////////////////////////////////////////////////////////////////////////

fun Activity.showNoConnectionMessage(){
    Toast.makeText(this, R.string.message_no_connection,Toast.LENGTH_SHORT).show()
}

/////////////////////////////////////////////////////////////////////////
// Connection back
/////////////////////////////////////////////////////////////////////////

fun Activity.showConnectionBackMessage(){
    Toast.makeText(this, R.string.message_connection_back,Toast.LENGTH_SHORT).show()
}