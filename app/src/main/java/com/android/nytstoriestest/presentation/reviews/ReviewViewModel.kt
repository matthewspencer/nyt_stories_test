package com.android.nytstoriestest.presentation.reviews

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.nytstoriestest.domain.model.Review
import com.android.nytstoriestest.domain.use_cases.ReviewUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ReviewViewModel @Inject constructor(
    private val reviewUseCases: ReviewUseCases
) : ViewModel() {
    private val _state = mutableStateOf(ReviewState())
    var state: State<ReviewState> = _state

    private var getReviewsJob: Job? = null

    init {

    }

    private fun getReviews() {
        getReviewsJob?.cancel()
        getReviewsJob = reviewUseCases.getReviews()
            .onEach {it: List<Review> ->
                _state.value = state.value.copy(
                    reviews = it
                )
            }
            .launchIn(viewModelScope)
    }
}