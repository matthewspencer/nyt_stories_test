package com.android.nytstoriestest.data.data_source

import com.android.nytstoriestest.domain.model.Review
import kotlinx.coroutines.flow.Flow

data class ReviewResponse(
    val results: Flow<List<Review>>
)
