package com.example.cleanarchitecture.ui.profile.presentation

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecture.R
import com.example.cleanarchitecture.databinding.FragmentProfileDetailBinding
import com.example.cleanarchitecture.ui.profile.domain.UserProfile
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ProfileDetail : Fragment() {
    private val viewModel: ProfileDetailViewModel by viewModels()
    private lateinit var binding: FragmentProfileDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileDetailBinding.inflate(inflater, container, false)

        getProfileData()


        return binding.root

    }

    private fun getProfileData() {
        viewModel.getUserProfile.observe(viewLifecycleOwner) {
            it?.let {
                binding.run {

                    userNameCapitalLetters.text=it.username
                    userName.text=it.name
                    userMail.text=it.email
                    userPhone.text=it.phone


                }
            }
        }
    }

}