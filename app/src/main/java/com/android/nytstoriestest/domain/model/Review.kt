package com.android.nytstoriestest.domain.model

import com.google.gson.annotations.SerializedName
import java.util.Date


data class Review(
    val title: String,
    val abstract: String,
    val byline: String,
    @SerializedName(value = "published_date") val publishedDate: String,
    val multimedia: Multimedia
)

data class Multimedia(
    val url: String
)

