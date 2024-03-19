package com.example.cleanarchitecture

import android.content.Context
import com.example.cleanarchitecture.ui.profile.data.datasource.ProfileDataSource
import com.example.cleanarchitecture.ui.profile.data.repo.ProfileRepository
import com.example.cleanarchitecture.ui.profile.data.repo.ProfileRepositoryImpl
import com.example.cleanarchitecture.ui.profile.data.util.ProfileApiService
import com.example.cleanarchitecture.ui.profile.domain.GetUserProfile
import com.example.cleanarchitecture.ui.profile.presentation.ProfileDetailViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
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

    @Module
    @InstallIn(SingletonComponent::class)
    object AppModule {

        @Singleton
        @Provides
        fun provideApplicationContext(@ApplicationContext context: Context): Context {
            return context
        }
    }
    @Module
@InstallIn(ActivityComponent::class)
object ViewModelModule {

    @Provides
    fun provideUserProfile(getUserProfile: GetUserProfile): ProfileDetailViewModel {
        return ProfileDetailViewModel(getUserProfile)
    }

}


}