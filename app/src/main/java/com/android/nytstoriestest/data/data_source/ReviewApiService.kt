package com.android.nytstoriestest.data.data_source

import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

private val retrofit = Retrofit.Builder()
    .baseUrl("https://api.nytimes.com/")
    .build()

interface ReviewApiService {
    @GET("/svc/search/v2/articlesearch.json")
    fun getArticles(
        @Query("api-key") apiKey: String = "6UxrySzZcvNStH511jYgEWiWoyzZdGBR",
        @Query("fq") filterQuery: String = "section_name:(\"Movies\") AND type_of_material:(\"Review\")"
    ): ReviewResponse
}

object ReviewApi {
    val retrofitService : ReviewApiService by lazy {
        retrofit.create(ReviewApiService::class.java)
    }
}