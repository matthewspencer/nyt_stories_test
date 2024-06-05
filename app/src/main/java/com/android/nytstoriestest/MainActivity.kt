package com.android.nytstoriestest

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.nytstoriestest.presentation.reviews.StoryScreen
import com.android.nytstoriestest.presentation.reviews.StoryViewModel
import com.android.nytstoriestest.presentation.util.Segment
import com.android.nytstoriestest.ui.theme.NYTStoriesTestTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()

        val viewModel = StoryViewModel()
        val context = Application()

        setContent {
            NYTStoriesTestTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "Home" ) {
                    composable(route = "Home") {
                        StoryScreen(
                            selectedSegment = Segment.StorySegment,
                            selectedSegmentName = "Story",
                            onSegmentSelected = "",
                            viewModel = viewModel
                        )
                    }
                }
            }
        }
    }
}
