package com.android.nytstoriestest.data.repository

import com.android.nytstoriestest.data.data_source.ReviewApi
import com.android.nytstoriestest.data.data_source.ReviewsApiService
import com.android.nytstoriestest.domain.model.Story
import com.android.nytstoriestest.domain.repository.StoryRepository

class ReviewRepositoryImpl (
    private val api: ReviewsApiService = ReviewApi.retrofitService
) : StoryRepository {
    override suspend fun getReviews(): List<Story> {
        return api.getStories().results
        }
    }