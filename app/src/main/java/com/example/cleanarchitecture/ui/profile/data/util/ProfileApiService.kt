package com.example.cleanarchitecture.ui.profile.data.util

import com.example.cleanarchitecture.ui.profile.data.response.ProfileResponse
import retrofit2.http.GET

interface ProfileApiService {
    @GET("users")
    fun getUsers(): retrofit2.Call<List<ProfileResponse>>
}