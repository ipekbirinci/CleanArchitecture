package com.example.cleanarchitecture.ui.profile.presentation

import androidx.lifecycle.ViewModel
import com.example.cleanarchitecture.ui.profile.domain.UserProfile
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileDetailViewModel @Inject constructor(
    val getUserProfile: UserProfile
) : ViewModel() {

    fun getUserProfile(id:Int, name: String, username: String, email: String, phone: String)=
        getUserProfile.execute(this,UserProfile.Params(id,name,username,email,phone))
}