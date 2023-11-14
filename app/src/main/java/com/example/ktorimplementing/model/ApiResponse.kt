package com.example.ktorimplementing.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse<T>(
    val Status: APIStatus,
    val Message: String,
    val Result: T
)
enum class APIStatus {
    OK,
    OTP,
    UNAUTHORIZED_DEVICE,
    UNAUTH,
    FAILED,
    OTPFAILED,
    SUCCESS
}