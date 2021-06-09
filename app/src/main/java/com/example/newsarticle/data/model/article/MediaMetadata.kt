package com.example.newsarticle.data.model.article


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MediaMetadata(
    @SerializedName("format")
    val format: String,
    @SerializedName("height")
    val height: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int
) : Serializable