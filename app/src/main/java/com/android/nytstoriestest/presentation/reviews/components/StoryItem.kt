package com.android.nytstoriestest.presentation.reviews.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.android.nytstoriestest.domain.model.Story
private const val TAG = "StoryItem"

@Composable
fun StoryItem(
    stories: Story
) {
    val itemHeight = 208

    Surface(
        modifier = Modifier.height(itemHeight.dp),
        shadowElevation = 32.dp
    ) {
        Row(modifier = Modifier.padding(all = 8.dp)) {

            AsyncImage(
                model = stories.multimedia?.firstOrNull()?.url,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(128.dp)
                    .height(itemHeight.dp)
            )
            Log.d(TAG, "StoryItem: ${stories.multimedia?.firstOrNull()?.url} ")

            Spacer(modifier = Modifier.padding(all = 8.dp))

            Column(
                modifier = Modifier.height(itemHeight.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stories.title,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = stories.abstract,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 4
                )

                Text(text = stories.byline,
                    style = MaterialTheme.typography.titleSmall
                )

                Text(
                    modifier = Modifier,
                    text = stories.publishedDate,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

/*
@Preview
@Composable
fun StoryItemPreview() {
    StoryItem()
}*/
