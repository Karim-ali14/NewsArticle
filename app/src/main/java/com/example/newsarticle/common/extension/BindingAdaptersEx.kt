package com.example.newsarticle.common.extension

import android.widget.ImageView
import androidx.databinding.BindingAdapter
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