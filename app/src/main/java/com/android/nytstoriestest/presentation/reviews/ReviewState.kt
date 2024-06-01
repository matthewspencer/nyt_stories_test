package com.android.nytstoriestest.presentation.reviews

import com.android.nytstoriestest.domain.model.Review

data class ReviewState(
    val reviews: List<Review> = emptyList(),

)
