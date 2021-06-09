package com.example.newsarticle.ui.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.newsarticle.R
import com.example.newsarticle.common.binder.viewBinding
import com.example.newsarticle.common.util.Constants.Tags.MAIN_ACTIVITY_TAG
import com.example.newsarticle.data.network.ApiHelper
import com.example.newsarticle.data.network.ApiService
import com.example.newsarticle.data.network.RetrofitBuilder
import com.example.newsarticle.data.repository.MainRepository
import com.example.newsarticle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        mainViewModel = ViewModelProvider(this,
            MainViewModelFactory(ApiHelper(RetrofitBuilder.getApiService())))
            .get(MainViewModel::class.java)

        setupObservables()
    }
    fun setupObservables(){
        mainViewModel.articleList.observe(this, Observer { articleList ->
            Log.i(MAIN_ACTIVITY_TAG,articleList.toString())
        })
    }
}