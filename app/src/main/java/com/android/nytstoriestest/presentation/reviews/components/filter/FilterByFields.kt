package com.android.nytstoriestest.presentation.reviews.components.filter

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.android.nytstoriestest.R
import com.android.nytstoriestest.presentation.reviews.StoryViewModel

@Composable
fun FilterByFields(viewModel: StoryViewModel) {

    val value = viewModel.searchText.collectAsState().value

    OutlinedTextField(
        modifier = Modifier.height(48.dp),
        value = value,
        onValueChange = {viewModel.updateTextSearch(it)},
        leadingIcon = { Icon(painter = painterResource(id = R.drawable.search), contentDescription = "") },
        maxLines = 1
    )
}