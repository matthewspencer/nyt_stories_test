package com.android.nytstoriestest.data.data_source

import com.android.nytstoriestest.domain.model.MovieReview
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.flow.Flow
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

private val retrofit by lazy {
    Retrofit.Builder()
        .baseUrl("https://api.nytimes.com/")
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
}

interface ReviewApiService {
    @GET("/svc/topstories/v2/world.json")
    suspend fun getArticles(
       @Query("api-key") apiKey: String = "6UxrySzZcvNStH511jYgEWiWoyzZdGBR"
    ): ReviewResponse
}

object ReviewApi {
    val retrofitService : ReviewApiService by lazy {
        retrofit.create(ReviewApiService::class.java)
    }
}