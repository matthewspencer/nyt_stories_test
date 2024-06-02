package com.android.nytstoriestest.data.repository

import com.android.nytstoriestest.data.data_source.ReviewApi
import com.android.nytstoriestest.data.data_source.ReviewApiService
import com.android.nytstoriestest.data.data_source.ReviewResponse
import com.android.nytstoriestest.domain.model.MovieReview
import com.android.nytstoriestest.domain.repository.ReviewRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import retrofit2.Callback

class ReviewRepositoryImpl (
    private val api: ReviewApiService = ReviewApi.retrofitService
) : ReviewRepository {
    override suspend fun getReviews(): List<MovieReview> {
        return api.getArticles().results
        }
    }