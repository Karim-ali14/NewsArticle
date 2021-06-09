package com.example.newsarticle.data.network

import com.example.newsarticle.common.util.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitBuilder {

    private fun getRetrofitClient() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.Links.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder()
                .readTimeout(30,TimeUnit.SECONDS)
                .writeTimeout(30,TimeUnit.SECONDS)
                .connectTimeout(1,TimeUnit.MINUTES)
                .addInterceptor(HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY))
                .build())
            .build()
    }

    fun getApiService() :ApiService = getRetrofitClient().create(ApiService::class.java)

}