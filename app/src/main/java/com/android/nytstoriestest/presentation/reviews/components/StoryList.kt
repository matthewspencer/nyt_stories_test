package com.android.nytstoriestest.presentation.reviews.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.unit.dp
import com.android.nytstoriestest.presentation.reviews.StoryViewModel
import dev.materii.pullrefresh.PullRefreshLayout
import dev.materii.pullrefresh.rememberPullRefreshState
import java.util.Locale

@Composable
fun StoryList(
    viewModel: StoryViewModel,
    onRefresh: () -> Unit
) {
    val state = viewModel.state.value
    val isRefreshing by remember { mutableStateOf(false) }
    val pullRefreshState = rememberPullRefreshState(refreshing = isRefreshing , onRefresh = onRefresh)

    val filteredList = viewModel.state.value.reviews.filter { story ->
        val searchText = viewModel.searchText.collectAsState("").value.lowercase()
        story.title.lowercase().contains(searchText) ||
                story.abstract.lowercase().contains(searchText) ||
                story.byline.lowercase().contains(searchText) ||
                story.publishedDate.lowercase().contains(searchText)
    }

    PullRefreshLayout(state = pullRefreshState) {

            LazyColumn() {

                items(filteredList) { item ->

                    StoryItem(stories = item)
                }
            }


    }

}