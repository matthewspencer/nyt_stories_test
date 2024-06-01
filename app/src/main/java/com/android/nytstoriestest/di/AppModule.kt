package com.android.nytstoriestest.di

import com.android.nytstoriestest.MyApp
import com.android.nytstoriestest.data.data_source.ReviewApiService
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
    fun provideApp() : MyApp {
        return MyApp()
    }
}