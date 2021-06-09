package com.example.newsarticle.data.model.article


import com.google.gson.annotations.SerializedName

data class ArticleResponse(
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("num_results")
    val numResults: Int,
    @SerializedName("results")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String
)