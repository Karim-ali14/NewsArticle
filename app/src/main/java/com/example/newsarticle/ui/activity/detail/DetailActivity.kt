package com.example.newsarticle.ui.activity.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsarticle.common.binder.viewBinding
import com.example.newsarticle.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private val binding:ActivityDetailBinding by viewBinding(ActivityDetailBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}