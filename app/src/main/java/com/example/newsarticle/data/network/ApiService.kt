package com.example.newsarticle.data.network

import com.example.newsarticle.data.model.article.ArticleResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("svc/mostpopular/v2/emailed/{period}.json")
    suspend fun getArticleList(@Path("period") period: String,
                               @Query("api-key") apiKey: String): Response<ArticleResponse>
}