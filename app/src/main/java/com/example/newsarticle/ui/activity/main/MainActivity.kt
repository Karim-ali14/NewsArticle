package com.example.newsarticle.ui.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.newsarticle.common.binder.viewBinding
import com.example.newsarticle.common.util.Constants
import com.example.newsarticle.data.network.ApiHelper
import com.example.newsarticle.data.network.RetrofitBuilder
import com.example.newsarticle.databinding.ActivityMainBinding
import com.example.newsarticle.ui.adapter.ArticleAdapter

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this,
            MainViewModelFactory(ApiHelper(RetrofitBuilder.getApiService())))
            .get(MainViewModel::class.java)

        binding.mainViewModel = mainViewModel
        binding.lifecycleOwner = this

        setupObservables()
    }

    private fun setupObservables(){
        mainViewModel.articleList.observe(this, Observer { articleList ->
            val articleAdapter = ArticleAdapter(articleList)
            binding.articleRecycler.setHasFixedSize(true)
            binding.articleAdapter = articleAdapter
        })
    }
}