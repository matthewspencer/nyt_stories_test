package com.android.nytstoriestest.presentation.reviews

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.nytstoriestest.domain.model.Story
import com.android.nytstoriestest.domain.use_cases.stories.GetStories
import com.android.nytstoriestest.domain.use_cases.stories.StoriesUseCases
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class StoryViewModel () : ViewModel() {
    private val reviewUseCases = StoriesUseCases(GetStories())

    private val _state = mutableStateOf(StoryState())
    var state = _state

    private val _searchText = MutableStateFlow("")
    var searchText = _searchText.asStateFlow()

    init {
        getReviews()
    }

    fun getReviews() {
        viewModelScope.launch {
            val data = reviewUseCases.getReviews()
            _state.value = _state.value.copy(reviews = data)
        }
    }

    fun updateTextSearch(text: String) {
        _searchText.value = text
    }

    fun updateDataList(newData: List<Story>) {
        _state.value = _state.value.copy(reviews = newData)
    }



}