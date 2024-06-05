package com.android.nytstoriestest.data.data_source

import com.android.nytstoriestest.domain.model.Story
import com.squareup.moshi.Json

data class StoryResponse(
    @Json(name = "results")
    val results: List<Story>
)
