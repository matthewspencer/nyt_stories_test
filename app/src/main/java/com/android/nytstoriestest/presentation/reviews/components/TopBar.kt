package com.android.nytstoriestest.presentation.reviews.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(selectedSegmentName: String, onSegmentSelected: String) {
    Box(modifier = Modifier.background(Color.Red)) {
        Column {
            Text(text = selectedSegmentName)

            Spacer(modifier = Modifier.height(36.dp))

            SegmentedControl(
                selectedSegmentName = selectedSegmentName,
                onSegmentSelected = onSegmentSelected
            )
            
            Spacer(modifier = Modifier.padding(8.dp))
        }
    }
}