package com.example.newsarticle.data.network

import com.example.newsarticle.data.model.article.Article

class ApiHelper (private val apiService: ApiService){
    suspend fun getArticleList(period: String,apiKey: String): ArrayList<Article> =
        apiService.getArticleList(period, apiKey).body()?.articles as ArrayList<Article>
}