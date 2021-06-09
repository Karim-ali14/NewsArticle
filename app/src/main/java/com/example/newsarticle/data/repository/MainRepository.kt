package com.example.newsarticle.data.repository

import com.example.newsarticle.common.util.Constants
import com.example.newsarticle.data.model.article.Article
import com.example.newsarticle.data.network.ApiHelper

class MainRepository(private val apiHelper: ApiHelper){
    suspend fun getArticleList() :ArrayList<Article> =
        apiHelper.getArticleList(Constants.Tags.DEFAULT_PERIOD,Constants.Tags.API_KEY)
}