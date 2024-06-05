package com.android.nytstoriestest.presentation.reviews

import com.android.nytstoriestest.domain.model.Story

data class StoryState(
    val reviews: List<Story> = emptyList(),

    )
