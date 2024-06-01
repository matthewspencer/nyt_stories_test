package com.android.nytstoriestest.presentation.reviews

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.android.nytstoriestest.domain.model.Review
import com.android.nytstoriestest.presentation.reviews.ReviewViewModel
import com.android.nytstoriestest.presentation.reviews.components.ReviewItem
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun ReviewScreen(
    viewModel: ReviewViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

    LazyColumn {
        items(state.reviews) { review ->
            ReviewItem(review = review)
        }
    }
}