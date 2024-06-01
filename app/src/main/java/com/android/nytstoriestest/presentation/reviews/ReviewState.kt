package com.android.nytstoriestest.presentation.reviews

import com.android.nytstoriestest.domain.model.MovieReview

data class ReviewState(
    val reviews: List<MovieReview> = emptyList(),

    )
