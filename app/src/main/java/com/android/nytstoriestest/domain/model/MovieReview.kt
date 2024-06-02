package com.android.nytstoriestest.domain.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class MovieReview(

    val title: String,
    val abstract: String,
    val byline: String,
    @Json(name = "published_date") val publishedDate: String,
    val multimedia: List<Multimedia>?
) {
    fun getFirstImageUrl(): String? {
        return multimedia?.firstOrNull()?.url
    }
}

data class Multimedia(
    val url: String
)

