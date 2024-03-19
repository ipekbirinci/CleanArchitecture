package com.example.cleanarchitecture

import com.example.cleanarchitecture.ui.profile.data.datasource.ProfileDataSource
import com.example.cleanarchitecture.ui.profile.data.repo.ProfileRepository
import com.example.cleanarchitecture.ui.profile.data.repo.ProfileRepositoryImpl
import com.example.cleanarchitecture.ui.profile.data.util.ProfileApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ProfileDetailModule {

    @Singleton
    @Provides
    fun providesNewsDetailRepository(dataSource: ProfileDataSource): ProfileRepository {
        return ProfileRepositoryImpl(dataSource)
    }

    @Singleton
    @Provides
    fun providesProfileDetailApiService(retrofit: Retrofit): ProfileApiService =
        retrofit.create(ProfileApiService::class.java)


}