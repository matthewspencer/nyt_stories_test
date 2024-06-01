package com.android.nytstoriestest.presentation.reviews.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.nytstoriestest.domain.model.MovieReview

@Composable
fun ReviewItem(
    review: MovieReview,
) {
    Surface {
        Row(modifier = Modifier.padding(all = 8.dp)) {

        }

        Spacer(modifier = Modifier.padding(all = 8.dp))

        Column {
            Text(text = review.title )

            Text(text = review.abstract)

            Text(text = review.byline)

            Row {
                Text(text = review.publishedDate)

                Text(text = review.publishedDate)

                Button(onClick = { /*TODO*/ }) {

                }
            }
        }
    }
}