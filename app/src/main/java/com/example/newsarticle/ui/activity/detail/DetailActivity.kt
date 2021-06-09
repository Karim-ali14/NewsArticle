package com.example.newsarticle.ui.activity.detail

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsarticle.common.binder.viewBinding
import com.example.newsarticle.common.util.Constants
import com.example.newsarticle.data.model.article.Article
import com.example.newsarticle.databinding.ActivityDetailBinding
import java.io.Serializable

class DetailActivity : AppCompatActivity() {

    companion object{
        fun instance(context: Context?,article: Article?) =
            Intent(context,DetailActivity::class.java).apply {
                putExtra(Constants.Keys.ARTICLE_KEY,article as Serializable)
            }
    }

    private val binding:ActivityDetailBinding by viewBinding(ActivityDetailBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val article = intent.extras?.getSerializable(Constants.Keys.ARTICLE_KEY) as Article
        binding.article = article

    }
}