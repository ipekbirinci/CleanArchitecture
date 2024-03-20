package com.example.cleanarchitecture.ui.profile.presentation

import androidx.lifecycle.ViewModel
import com.example.cleanarchitecture.ui.profile.domain.GetUserProfile
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileDetailViewModel @Inject  constructor(
  private val getUserProfile: GetUserProfile
) : ViewModel() {

    fun getUserProfile(id:Int, name: String, username: String, email: String, phone: String)=
        getUserProfile.execute(this,GetUserProfile.Params(id,name,username,email,phone))
}