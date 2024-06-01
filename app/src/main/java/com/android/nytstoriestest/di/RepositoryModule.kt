package com.android.nytstoriestest.di

import com.android.nytstoriestest.data.repository.ReviewRepositoryImpl
import com.android.nytstoriestest.domain.repository.ReviewRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindReviewRepository(
        reviewRepositoryImpl: ReviewRepositoryImpl
    ) : ReviewRepository
}