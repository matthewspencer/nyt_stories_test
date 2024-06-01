package com.android.nytstoriestest.data.repository

import com.android.nytstoriestest.data.data_source.ReviewApi
import com.android.nytstoriestest.data.data_source.ReviewApiService
import com.android.nytstoriestest.domain.model.Review
import com.android.nytstoriestest.domain.repository.ReviewRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ReviewRepositoryImpl (
    private val api: ReviewApiService = ReviewApi.retrofitService
) : ReviewRepository {
    override fun getReviews(): Flow<List<Review>> {
        val response = api.getArticles()
        return response.results
    }
}