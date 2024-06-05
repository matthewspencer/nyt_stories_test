package com.android.nytstoriestest.presentation.reviews.components

import android.content.res.Resources.Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.android.nytstoriestest.R
import com.android.nytstoriestest.ui.theme.NYTStoriesTestTheme

@Composable
fun TopBar(selectedSegmentName: String, onSegmentSelected: String) {
    NYTStoriesTestTheme {
        Box(modifier = Modifier.background(colorResource(id = R.color.peach))) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    modifier = Modifier.padding(top = 32.dp),
                    text = selectedSegmentName,
                    style = MaterialTheme.typography.headlineMedium
                )

                Spacer(modifier = Modifier.height(36.dp))

                SegmentedControl(
                    selectedSegmentName = selectedSegmentName,
                    onSegmentSelected = onSegmentSelected
                )

                Spacer(modifier = Modifier.padding(8.dp))
            }
        }
    }

}