package com.example.cleanarchitecture.ui.profile.data.repo

import com.example.cleanarchitecture.ui.profile.data.datasource.ProfileDataSource

class ProfileRepositoryImpl(

    private val dataSource: ProfileDataSource
):ProfileRepository {

    override fun getUser( id: Int,
                          name: String,
                          username: String,
                          email: String,
                          phone: String,) =
        dataSource.getUser(id=id,email = email, username = username, name = name, phone = phone)




}