package com.example.newsarticle.ui.activity.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsarticle.data.model.article.Article
import com.example.newsarticle.data.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: MainRepository) :ViewModel(){

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading:LiveData<Boolean> get() =  _isLoading

    private val _isError = MutableLiveData<Boolean>()
    val isError:LiveData<Boolean> get() =  _isError

    private val _articleList = MutableLiveData<ArrayList<Article>>()
    val articleList:LiveData<ArrayList<Article>> get() =  _articleList

    init {
        loadArticleList()
    }

    fun loadArticleList() = viewModelScope.launch(Dispatchers.IO) {
        _isLoading.postValue(true)
        try {
            _isError.postValue(false)
            _articleList.postValue(repository.getArticleList())
        }catch (exception : Exception){
            _isError.postValue(true)
            _articleList.postValue(arrayListOf())
        }finally {
            _isLoading.postValue(false)
        }
    }


}