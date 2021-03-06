package com.example.newsarticle.ui.activity.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsarticle.data.network.ApiHelper
import com.example.newsarticle.data.repository.MainRepository
import java.lang.IllegalArgumentException

class MainViewModelFactory(private val apiHelper: ApiHelper) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("unKnow ViewModel Class")
    }
}