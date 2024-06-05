package com.android.nytstoriestest.presentation.reviews.components.filter

import androidx.compose.foundation.layout.height
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberDateRangePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.android.nytstoriestest.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterByDate() {

    OutlinedTextField(
        modifier = Modifier.height(48.dp),
        value = "",
        onValueChange = {},
        leadingIcon = { Icon(painter = painterResource(id = R.drawable.date), contentDescription = "")}
    )
}