package com.android.nytstoriestest.presentation.reviews

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.android.nytstoriestest.presentation.reviews.components.ReviewItem

@Composable
fun ReviewScreen(
    viewModel: ReviewViewModel = ReviewViewModel()
) {
    val state = viewModel.state.value

    LazyColumn {
        items(state.reviews) { review ->
            ReviewItem(movieReview = review)
        }
    }
}