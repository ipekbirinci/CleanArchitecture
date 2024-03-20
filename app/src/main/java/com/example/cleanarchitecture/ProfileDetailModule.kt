
package com.example.cleanarchitecture

import android.app.Activity
import android.app.Application
import com.example.cleanarchitecture.ui.profile.data.datasource.ProfileDataSource
import com.example.cleanarchitecture.ui.profile.data.repo.ProfileRepository
import com.example.cleanarchitecture.ui.profile.data.repo.ProfileRepositoryImpl
import com.example.cleanarchitecture.ui.profile.data.util.ProfileApiService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
 class ProfileDetailModule {

    @Singleton
    @Provides
    fun providesProfileDetailRepository(dataSource: ProfileDataSource): ProfileRepository {

        return ProfileRepositoryImpl(dataSource)
    }

    @Singleton
    @Provides
    fun providesProfileDataSource(profileApiService: ProfileApiService): ProfileDataSource {

        return ProfileDataSource(profileApiService)
    }



}

