package com.example.cleanarchitecture.ui.profile.data.repo

import android.database.Observable
import com.example.cleanarchitecture.ui.profile.data.response.ProfileResponse
import retrofit2.Call
import javax.inject.Inject

interface ProfileRepository {

    suspend fun getUser(url:String): ProfileResponse
}