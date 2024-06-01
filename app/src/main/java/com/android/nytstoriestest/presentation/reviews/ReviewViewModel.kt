package com.android.nytstoriestest.presentation.reviews

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.nytstoriestest.domain.use_cases.GetReviews
import com.android.nytstoriestest.domain.use_cases.ReviewUseCases
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class ReviewViewModel () : ViewModel() {
    private val reviewUseCases = ReviewUseCases(GetReviews())

    private val _state = mutableStateOf(ReviewState())
    var state: State<ReviewState> = _state

    init {
        getReviews()
    }

    private fun getReviews() {
        viewModelScope.launch {
            reviewUseCases.getReviews().onEach {
                reviewUseCases.getReviews()
                    .collect {
                        _state.value = _state.value.copy(reviews = it)
                    }
            }
        }
    }
}