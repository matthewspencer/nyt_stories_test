package com.android.nytstoriestest.domain.util

import com.android.nytstoriestest.domain.model.Story
import java.text.SimpleDateFormat

object DateFormatter {
    fun DateFormatter(date: String): String {
        val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX")
        val outputFormat = SimpleDateFormat("yyyy/MM/dd      hh:MM:ss")
        val date = inputFormat.parse(date)
        return outputFormat.format(date)
    }
}
