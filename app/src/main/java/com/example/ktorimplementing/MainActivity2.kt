package com.example.ktorimplementing

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.ktorimplementing.model.Result
import com.example.ktorimplementing.ui.theme.KtorimplementingTheme

class MainActivity2 : ComponentActivity() {
    private var loggedInMessage by mutableStateOf<String>("Hello")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val result: ArrayList<Result>? = intent.getParcelableArrayListExtra("result_data")
        setContent {
            KtorimplementingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(result)
                }
            }
        }
    }
}

@Composable
fun Greeting(result: ArrayList<Result>?, modifier: Modifier = Modifier) {
    Log.d("Access token",result?.get(0)?.access_token.toString())
    Column {
        Row {
            Text(
                text = "Access token :${result?.get(0)?.access_token}",
                modifier = modifier
            )
        }
        Row {
            Text(
                text = "userName : ${result?.get(0)?.userName}",
                modifier = modifier
            )
        }
        Row {
            Text(
                text = "auth2FAProvider :${result?.get(0)?.auth2FAProvider}",
                modifier = modifier
            )
        }
        Row {
            Text(
                text = "branchId: ${result?.get(0)?.branchId}",
                modifier = modifier
            )
        }
        Text(
            text = "customerId :${result?.get(0)?.customerId}",
            modifier = modifier
        )
        Text(
            text = "customerTypeID :${result?.get(0)?.customerTypeID}",
            modifier = modifier
        )
        Text(
            text = "customerTypeNM :${result?.get(0)?.customerTypeNM}",
            modifier = modifier
        )
        Text(
            text = "deviceIMEI :${result?.get(0)?.deviceIMEI}",
            modifier = modifier
        )
        Text(
            text = "expires :${result?.get(0)?.expires}",
            modifier = modifier
        )
        Text(
            text = "expires_in :${result?.get(0)?.expires_in}",
            modifier = modifier
        )
        Text(
            text = "fullName :${result?.get(0)?.fullName}",
            modifier = modifier
        )
        Text(
            text = "isFirstLogin :${result?.get(0)?.isFirstLogin}",
            modifier = modifier
        )
        Text(
            text = "isTPINMendatory: ${result?.get(0)?.isTPINMendatory}",
            modifier = modifier
        )
        Text(
            text = "isquesEnable: ${result?.get(0)?.isquesEnable}",
            modifier = modifier
        )
        Text(
            text = "issued :${result?.get(0)?.issued}",
            modifier = modifier
        )
    }





}


//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview2() {
//    KtorimplementingTheme {
//        Greeting(loggedInMessage = "Hello")
//    }
//}
