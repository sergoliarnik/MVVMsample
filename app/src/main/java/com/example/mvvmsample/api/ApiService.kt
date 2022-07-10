package com.example.mvvmsample.api

import com.example.mvvmsample.helper.Constants
import com.example.mvvmsample.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows(): Response<TvShowResponse>

}