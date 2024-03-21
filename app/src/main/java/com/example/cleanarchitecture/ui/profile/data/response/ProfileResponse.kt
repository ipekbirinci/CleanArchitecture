package com.example.cleanarchitecture.ui.profile.data.response

import com.google.gson.annotations.SerializedName

data class ProfileResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("phone")
    val phone: String,
)

