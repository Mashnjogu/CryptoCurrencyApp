package com.example.cryptoapp.presentation

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cryptoapp.presentation.coin_detail.CoinDetailScreen
import com.example.cryptoapp.presentation.coin_list.CoinListScreen
import com.example.cryptoapp.ui.theme.CryptoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoAppTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                NavHost(
                    navController =navController,
                    startDestination = Screen.CoinListScreen.route){
                    composable(
                        route = Screen.CoinListScreen.route
                    ) {
                        CoinListScreen(navController)
                    }
                    composable(
                        route = Screen.CoinDetailScreen.route + "/{coinId}"
                    ) {
                        CoinDetailScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CryptoAppTheme {
        Greeting("Android")
    }
}