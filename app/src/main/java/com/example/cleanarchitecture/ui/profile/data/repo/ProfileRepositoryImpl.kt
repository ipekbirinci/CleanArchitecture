package com.example.cleanarchitecture.ui.profile.data.repo

import com.example.cleanarchitecture.ui.profile.data.datasource.ProfileDataSource
import com.example.cleanarchitecture.ui.profile.data.response.ProfileResponse
import javax.inject.Inject

class ProfileRepositoryImpl@Inject constructor(
    private val dataSource: ProfileDataSource
):ProfileRepository {
    override suspend  fun getUser(url:String): ProfileResponse = dataSource.getUser(url)

}