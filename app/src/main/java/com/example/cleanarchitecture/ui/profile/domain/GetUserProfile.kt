package com.example.cleanarchitecture.ui.profile.domain

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecture.ui.profile.data.repo.ProfileRepository
import com.example.cleanarchitecture.ui.profile.data.response.ProfileResponse
import com.example.cleanarchitecture.ui.profile.presentation.ProfileDetailViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


class GetUserProfile @Inject constructor(
    private val profileRepository: ProfileRepository
): MutableLiveData<ProfileResponse>(){

    companion object {
        private const val URL =
            "https://jsonplaceholder.typicode.com/users/1"
    }

    data class Params(
        val id: Int,
        val name: String,
        val username: String,
        val email: String,
        val phone: String,
    )


     fun execute(
        viewModel: ProfileDetailViewModel,
        input: Params?
    ): MutableLiveData<ProfileResponse> {
        return MutableLiveData<ProfileResponse>().apply {
            input?.let {
                viewModel.viewModelScope.launch {
                    value =
                        profileRepository.getUser(URL+it.id+it.name+it.username+it.email+it.phone)
                }
            }
        }
    }
}
