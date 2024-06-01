package com.android.nytstoriestest.data.data_source

import com.android.nytstoriestest.domain.model.MovieReview
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.adapter
import kotlinx.coroutines.flow.Flow
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private val moshi = Moshi.Builder().build()

private val retrofit = Retrofit.Builder()
    .baseUrl("https://api.nytimes.com/")
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()

interface ReviewApiService {
    @GET("/svc/search/v2/articlesearch.json")
    fun getArticles(
        @Query("api-key") apiKey: String = "6UxrySzZcvNStH511jYgEWiWoyzZdGBR",
        @Query("fq") filterQuery: String = "section_name:(\"Movies\") AND type_of_material:(\"Review\")"
    ): Flow<ReviewResponse>
}

object ReviewApi {
    val retrofitService : ReviewApiService by lazy {
        retrofit.create(ReviewApiService::class.java)
    }
}