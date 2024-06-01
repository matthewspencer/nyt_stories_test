package com.android.nytstoriestest.domain.use_cases

import com.android.nytstoriestest.data.repository.ReviewRepositoryImpl
import com.android.nytstoriestest.domain.model.MovieReview
import com.android.nytstoriestest.domain.repository.ReviewRepository
import kotlinx.coroutines.flow.Flow

class GetReviews(
    private val repository: ReviewRepository = ReviewRepositoryImpl()
) {
    operator fun invoke(): Flow<List<MovieReview>> {
        return repository.getReviews()
    }


}


