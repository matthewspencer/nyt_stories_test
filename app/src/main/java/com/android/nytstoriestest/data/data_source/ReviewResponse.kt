package com.android.nytstoriestest.data.data_source

import com.android.nytstoriestest.domain.model.MovieReview
import com.squareup.moshi.Json
import javax.net.ssl.SSLEngineResult.Status

data class ReviewResponse(
    @Json(name = "results")
    val results: List<MovieReview>
)
