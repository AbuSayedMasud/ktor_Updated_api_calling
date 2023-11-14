package com.example.ktorimplementing.model

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequest(
    val DeviceToken: String,
    val DeviceType: String,
    val ImeiOrIP: String,
    val OTP: String,
    val Password: String,
    val TPIN: String,
    val UserName: String
)