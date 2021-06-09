package com.example.newsarticle.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsarticle.data.model.article.Article
import com.example.newsarticle.databinding.LayoutItemArticleBinding
import com.example.newsarticle.ui.activity.main.MainActivity

class ArticleAdapter(
    private val articleList: ArrayList<Article>,
    private val mainActivity: MainActivity)
    : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    class ArticleViewHolder(val layoutItemArticleBinding:
                            LayoutItemArticleBinding):RecyclerView.ViewHolder(layoutItemArticleBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = LayoutItemArticleBinding.inflate(layoutInflater,parent,false)
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.layoutItemArticleBinding.article = articleList[position]
        holder.layoutItemArticleBinding.mainActivity = mainActivity
    }

    override fun getItemCount(): Int = articleList.size
}