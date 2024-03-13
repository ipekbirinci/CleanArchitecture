package com.example.cleanarchitecture.ui.profile.domain

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.cleanarchitecture.ui.profile.data.repo.ProfileRepository
import com.example.cleanarchitecture.ui.profile.data.response.ProfileResponse
import com.example.cleanarchitecture.ui.profile.data.util.ProfileApiService
import okhttp3.Response
import retrofit2.Call
import retrofit2.Callback
import javax.inject.Inject

class UserProfile @Inject constructor(
    private val profileRepository: ProfileRepository
) {
    val stockLiveData = MutableLiveData<List<ProfileResponse>?>()

    fun getUser() {
        profileRepository.getUser().enqueue(object : Callback<List<ProfileResponse>> {
            override fun onResponse(call: Call<List<ProfileResponse>>, response: Response<List<ProfileResponse>>) {


                if(response.isSuccessful)
                {
                    Log.d("asssd",response.body().toString())
                    val result = response.body()
                    if (result.isNullOrEmpty()) {
                        stockLiveData.value = null
                        Log.d("respo",stockLiveData.toString())
                    } else {
                        stockLiveData.value = result
                    }
                }else{

                    Log.d("sdfsdf",response.message())
                }

            }

            override fun onFailure(call: Call<List<ProfileResponse>>, t: Throwable) {
                Log.e("Failure", t.message.orEmpty())
            }
        })
    }
}