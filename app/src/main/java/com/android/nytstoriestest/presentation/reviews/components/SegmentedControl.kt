package com.android.nytstoriestest.presentation.reviews.components

import android.content.res.Resources.Theme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SegmentedControl(
    selectedSegmentName: String,
    onSegmentSelected: (String)
) {
    val segments = listOf("Story", "Author")

    val cornerRadius = 8.dp
    val customShape = RoundedCornerShape(
        topStart = cornerRadius,
        topEnd = 0.dp,
        bottomStart = cornerRadius,
        bottomEnd = 0.dp
    )

    Row(
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {

        segments.forEach { segment ->
            val isSelected = segment == selectedSegmentName
                TextButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(32.dp)
                        .clip(RoundedCornerShape(8.dp)),
                    onClick = { onSegmentSelected },
                    colors = changeButtonColors(isSelected),
                    shape = customShape,
                    contentPadding = PaddingValues(
                        horizontal = 16.dp,
                        vertical = 8.dp
                    )
                ) {
                Text(
                    text = segment,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Composable
private fun changeButtonColors(isSelected: Boolean): ButtonColors {
    return if (isSelected) {
        ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    } else {
        ButtonDefaults.buttonColors(
            containerColor = Color.Black,
            contentColor = Color.White
        )
    }
}


@Composable
@Preview
fun SegmentedControlPreview() {
    SegmentedControl(selectedSegmentName = "Story" , onSegmentSelected = "")
}