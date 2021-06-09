package com.example.newsarticle.common.extension

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.bumptech.glide.Glide

/////////////////////////////////////////////////////////////////////////
// ImageViews Adapters.
/////////////////////////////////////////////////////////////////////////

@BindingAdapter(value = ["glideImageUrl"])
fun ImageView.glideImageUrl(url:String?){
    this.run {
        if (!url.isNullOrEmpty()){
            Glide
                .with(this)
                .load(url)
                .into(this)
        }
    }
}

/////////////////////////////////////////////////////////////////////////
// Swipe Adapters
/////////////////////////////////////////////////////////////////////////

@BindingAdapter(value = ["isRefreshing"])
fun SwipeRefreshLayout.isRefreshing(newValue:Boolean){
    this.run {
        this.isRefreshing = newValue
    }
}

/////////////////////////////////////////////////////////////////////////
// Swipe Refreshing Adapter
/////////////////////////////////////////////////////////////////////////

@BindingAdapter(value = ["onRefreshing"])
fun SwipeRefreshLayout.onRefreshing(action : () -> Unit){
    this.setOnRefreshListener {
        action()
    }
}