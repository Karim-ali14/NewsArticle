package com.example.newsarticle.common.extension

import android.app.Activity
import com.example.newsarticle.data.model.article.Article
import com.example.newsarticle.ui.activity.detail.DetailActivity

/////////////////////////////////////////////////////////////////////////
// Start Detail Activity.
/////////////////////////////////////////////////////////////////////////

fun Activity.openDetailActivity(article: Article){
    startActivity(DetailActivity.instance(this,article))
}