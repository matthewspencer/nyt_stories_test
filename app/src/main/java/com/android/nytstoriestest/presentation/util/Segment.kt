package com.android.nytstoriestest.presentation.util

sealed class Segment {
    data object StorySegment : Segment() {
        val title = "Story"
    }
    data object CriticSegment : Segment() {
        val title = "Critics"
    }
}
