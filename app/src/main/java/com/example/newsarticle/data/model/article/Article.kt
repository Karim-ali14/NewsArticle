package com.example.newsarticle.data.model.article


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Article(
    @SerializedName("abstract")
    val `abstract`: String,
    @SerializedName("adx_keywords")
    val adxKeywords: String,
    @SerializedName("asset_id")
    val assetId: Long,
    @SerializedName("byline")
    val byline: String,
    @SerializedName("column")
    val column: Any,
    @SerializedName("des_facet")
    val desFacet: List<String>,
    @SerializedName("eta_id")
    val etaId: Int,
    @SerializedName("geo_facet")
    val geoFacet: List<String>,
    @SerializedName("id")
    val id: Long,
    @SerializedName("media")
    val media: List<Media>,
    @SerializedName("nytdsection")
    val nytdsection: String,
    @SerializedName("org_facet")
    val orgFacet: List<String>,
    @SerializedName("per_facet")
    val perFacet: List<String>,
    @SerializedName("published_date")
    val publishedDate: String,
    @SerializedName("section")
    val section: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("subsection")
    val subsection: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("updated")
    val updated: String,
    @SerializedName("uri")
    val uri: String,
    @SerializedName("url")
    val url: String
):Serializable{

    fun getImageUrl():String { // for get Any Photo as Article Photo this just for test ^_-
        return if (!media.isNullOrEmpty()){
            if (!media[0].mediaMetadata.isNullOrEmpty()){
                media[0].mediaMetadata[0].url
            }else{
                ""
            }
        }else{
            ""
        }
    }

}