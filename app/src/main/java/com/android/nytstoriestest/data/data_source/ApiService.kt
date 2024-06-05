package com.android.nytstoriestest.data.data_source

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
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

interface ReviewsApiService {
    /*@GET("/svc/search/v2/articlesearch.json")
    suspend fun getArticles(
        @Query("api-key") apiKey: String = "6UxrySzZcvNStH511jYgEWiWoyzZdGBR",
        @Query("fq") filterQuery: String = "section_name:(\"Movies\") AND type_of_material:(\"Review\")"
    ): ReviewResponse*/

    @GET("/svc/topstories/v2/world.json")
    suspend fun getStories(
        @Query("api-key") apiKey: String = "6UxrySzZcvNStH511jYgEWiWoyzZdGBR"
    ): StoryResponse
}

/*interface CriticApiService {
    @GET()
    suspend fun getCritics(
        @Query
    )

}*/

object ReviewApi {
    val retrofitService : ReviewsApiService by lazy {
        retrofit.create(ReviewsApiService::class.java)
    }
}