package com.android.nytstoriestest.domain.use_cases

import com.android.nytstoriestest.domain.model.Review
import com.android.nytstoriestest.domain.repository.ReviewRepository
import kotlinx.coroutines.flow.Flow
import org.json.JSONObject

class GetReviews(
    private val repository: ReviewRepository
) {
    operator fun invoke(): Flow<List<Review>> {
        return repository.getReviews()
    }


}


