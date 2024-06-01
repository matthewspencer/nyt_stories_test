package com.android.nytstoriestest.domain.repository

import com.android.nytstoriestest.domain.model.Review
import kotlinx.coroutines.flow.Flow

interface ReviewRepository {

    fun getReviews(): Flow<List<Review>>

}