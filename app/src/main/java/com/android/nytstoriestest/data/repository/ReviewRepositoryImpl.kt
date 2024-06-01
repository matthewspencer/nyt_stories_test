package com.android.nytstoriestest.data.repository

import com.android.nytstoriestest.data.data_source.ReviewApiService
import com.android.nytstoriestest.domain.model.Review
import com.android.nytstoriestest.domain.repository.ReviewRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReviewRepositoryImpl @Inject constructor(
    private val api: ReviewApiService
) : ReviewRepository {
    override fun getReviews(): Flow<List<Review>> {
        val response = api.getArticles()
        return response.results
    }
}