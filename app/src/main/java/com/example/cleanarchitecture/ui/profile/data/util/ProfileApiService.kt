package com.example.cleanarchitecture.ui.profile.data.util

import com.example.cleanarchitecture.ui.profile.data.response.ProfileResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url
import javax.inject.Inject

interface ProfileApiService  {
    @GET
    suspend fun getUsers(@Url url:String): ProfileResponse
}