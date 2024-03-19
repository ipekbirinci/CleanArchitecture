@file:Suppress("DEPRECATION")

package com.example.cleanarchitecture.ui.profile.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.cleanarchitecture.MainActivity
import com.example.cleanarchitecture.databinding.FragmentProfileDetailBinding
import dagger.Provides
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class ProfileDetailFragment @Inject constructor() : Fragment() {

 lateinit var viewModel: ProfileDetailViewModel

   // private val viewModel:ProfileDetailViewModel by activityViewModels()
    private lateinit var binding: FragmentProfileDetailBinding




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileDetailBinding.inflate(inflater, container, false)
        viewModel = activity?.run { ViewModelProviders.of(this)[ProfileDetailViewModel::class.java] } ?: throw Exception("Invalid Activity")

        /*viewModel= ViewModelProvider(
            requireActivity(),
            defaultViewModelProviderFactory
        ).get(ProfileDetailViewModel::class.java)*/

        //viewModel = ViewModelProviders.of(this).get(ProfileDetailViewModel::class.java)
      //viewModel = ViewModelProvider(requireActivity()).get(ProfileDetailViewModel::class.java)


        getProfileData(1,"ipek","pekibi","ipek.birinci@gmail.com","05460677654")
        return binding.root

    }


    private fun getProfileData (id:Int, name: String, username: String, email: String, phone: String) {
        viewModel.getUserProfile(id, name, username, email, phone).observe(viewLifecycleOwner,Observer{

            it?.let {
                binding.run {

                    userNameCapitalLetters.text=it.username
                    userName.text=it.name
                    userMail.text=it.email
                    userPhone.text=it.phone


                }}})
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)
        viewModel = activity?.run { ViewModelProviders.of(this)[ProfileDetailViewModel::class.java] } ?: throw Exception("Invalid Activity")

        /*viewModel= ViewModelProvider(
            requireActivity(),
            defaultViewModelProviderFactory
        )[ProfileDetailViewModel::class.java]*/

        //viewModel = ViewModelProviders.of(this).get(ProfileDetailViewModel::class.java)
      //viewModel = ViewModelProvider(requireActivity()).get(ProfileDetailViewModel::class.java)

        //viewModel = activity?.run { ViewModelProviders.of(this).[ProfileDetailViewModel::class.java] } ?: throw Exception("Invalid Activity")
        // viewModel=ViewModelProvider.of(this).get(ProfileDetailViewModel::class.java)

         //viewModel = ViewModelProviders.of(activity!!)[MapViewModel::class.java]
     }*/


}