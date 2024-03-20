package com.example.cleanarchitecture

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecture.databinding.ActivityMainBinding
import com.example.cleanarchitecture.databinding.FragmentProfileDetailBinding
import com.example.cleanarchitecture.ui.profile.data.response.ProfileResponse
import com.example.cleanarchitecture.ui.profile.presentation.ProfileDetailViewModel
import dagger.Provides
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ActivityContext
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }



}