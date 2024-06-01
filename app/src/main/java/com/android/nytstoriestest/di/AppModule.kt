package com.android.nytstoriestest.di

import com.android.nytstoriestest.MyApp
import com.android.nytstoriestest.data.data_source.ReviewApiService
import com.android.nytstoriestest.data.repository.ReviewRepositoryImpl
import com.android.nytstoriestest.domain.repository.ReviewRepository
import com.android.nytstoriestest.domain.use_cases.GetReviews
import com.android.nytstoriestest.domain.use_cases.ReviewUseCases

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideReviewApi() : ReviewApiService {
        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/")
            .build()
            .create(ReviewApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: ReviewApiService) : ReviewRepository {
        return ReviewRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideReviewUseCases(repository: ReviewRepository) : ReviewUseCases {
        return ReviewUseCases(GetReviews(repository))
    }
}