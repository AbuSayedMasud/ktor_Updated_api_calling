package com.example.ktorimplementing.repository

import android.util.Log
import com.example.ktorimplementing.model.APIStatus
import com.example.ktorimplementing.model.ApiResponse
import com.example.ktorimplementing.model.LoginRepository
import com.example.ktorimplementing.model.LoginRequest
import com.example.ktorimplementing.model.Result
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.runBlocking

class LoginRepositoryImpl : LoginRepository {
    override fun didLogIn(): List<Result> {
        val client = HttpClient {
            install(ContentNegotiation) {
                json()
            }
        }
        var responseContent: ApiResponse<Result>? = null

        try {
            runBlocking {
                responseContent =
                    client.post("http://192.168.20.218/CloudNetAPIExt/api/login/login") {
                        contentType(ContentType.Application.Json)
                        setBody(
                            LoginRequest(
                                DeviceToken = "",
                                DeviceType = "",
                                ImeiOrIP = "MOB-1111",
                                OTP = "",
                                Password = "1",
                                TPIN = "",
                                UserName = "ibnul"
                            )
                        )
                    }.body()


//            val jsonObject = Json.parseToJsonElement(responseContent ?: "").jsonObject
//            val token = jsonObject["token"]?.jsonPrimitive?.contentOrNull
                Log.d("afffadgdgdfhfdjgsdshdf", responseContent!!.Message)


            }
        } catch (e: Exception) {
            Log.e("API Call Error", e.toString())


        }
        return listOf(responseContent!!.Result)
    }
}