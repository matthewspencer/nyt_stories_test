package com.android.nytstoriestest.presentation.reviews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.android.nytstoriestest.presentation.reviews.components.filter.FilterByFields
import com.android.nytstoriestest.presentation.reviews.components.StoryList
import com.android.nytstoriestest.presentation.reviews.components.TopBar
import com.android.nytstoriestest.presentation.reviews.components.filter.FilterBars
import com.android.nytstoriestest.presentation.util.Segment

@Composable
fun StoryScreen(
    selectedSegment: Segment,
    selectedSegmentName: String,
    onSegmentSelected: String,
    viewModel: StoryViewModel,
) {
    Scaffold(topBar = {
        TopBar(selectedSegmentName = selectedSegmentName, onSegmentSelected = onSegmentSelected)
    }) {

        Box(modifier = Modifier.padding(it)) {

            Column {

                FilterBars(viewModel = viewModel)

                if (selectedSegment == Segment.StorySegment) {
                    StoryList(viewModel = viewModel, onRefresh = { viewModel.getReviews()} )
                }
            }
        }
    }
}