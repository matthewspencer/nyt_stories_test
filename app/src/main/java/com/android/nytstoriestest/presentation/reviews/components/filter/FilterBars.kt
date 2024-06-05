package com.android.nytstoriestest.presentation.reviews.components.filter

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.nytstoriestest.presentation.reviews.StoryViewModel

@Composable
fun FilterBars(viewModel: StoryViewModel) {
    Column(modifier = Modifier.padding(16.dp)) {

        FilterByFields(viewModel = viewModel)

        Spacer(modifier = Modifier.padding(8.dp))

        FilterByDate()
    }


}