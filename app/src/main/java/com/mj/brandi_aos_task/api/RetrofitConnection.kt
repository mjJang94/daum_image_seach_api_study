package com.mj.brandi_aos_task.api

import com.mj.brandi_aos_task.reponse.ImageSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitConnection {

    @GET("test") fun getCovidInfo(@Query("query") query: String, @Query("sort") sort: String, @Query("page") page: String, @Query("size") size: String): Call<ImageSearchResponse>
}


