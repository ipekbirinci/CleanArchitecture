package com.example.cleanarchitecture.ui.profile.data.datasource

import com.example.cleanarchitecture.ui.profile.data.util.ProfileApiService
import retrofit2.http.Url
import javax.inject.Inject

class ProfileDataSource @Inject constructor(
    private val profileApiService: ProfileApiService
) {

   suspend fun getUser(url: String)=profileApiService.getUsers(url)

}