package com.android.nytstoriestest.domain.use_cases.stories

import com.android.nytstoriestest.data.repository.ReviewRepositoryImpl
import com.android.nytstoriestest.domain.model.Story
import com.android.nytstoriestest.domain.repository.StoryRepository

class GetStories(
    private val repository: StoryRepository = ReviewRepositoryImpl()
) {
    suspend operator fun invoke(): List<Story> {
        return repository.getReviews()
    }


}


