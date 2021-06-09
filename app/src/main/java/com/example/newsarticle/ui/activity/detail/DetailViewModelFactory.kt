package com.example.newsarticle.ui.activity.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class DetailViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)){
            DetailViewModel() as T
        }
        throw IllegalArgumentException("unKnow ViewModel Class")
    }
}