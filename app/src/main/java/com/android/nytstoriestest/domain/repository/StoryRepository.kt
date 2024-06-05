package com.android.nytstoriestest.domain.repository

import com.android.nytstoriestest.domain.model.Story

interface StoryRepository {

    suspend fun getReviews(): List<Story>

}