package com.example.cleanarchitecture.ui.profile.data.datasource

import com.example.cleanarchitecture.ui.profile.data.util.ProfileApiService

class ProfileDataSource(
    private val profileApiService: ProfileApiService
) {

  fun getUser(
      id: Int,
      name: String,
      username: String,
      email: String,
      phone: String,) =
        profileApiService.getUsers(
        )

}