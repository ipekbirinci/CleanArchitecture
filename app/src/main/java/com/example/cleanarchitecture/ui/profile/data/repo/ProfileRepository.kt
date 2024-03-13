package com.example.cleanarchitecture.ui.profile.data.repo

import android.database.Observable
import com.example.cleanarchitecture.ui.profile.data.response.ProfileResponse

interface ProfileRepository {

    fun getUser(
        id: Int,
        name: String,
        username: String,
        email: String,
        phone: String,

    ):Observable<ProfileResponse>
}