package com.example.cryptoapp.presentation

sealed class Screen(val route: String){
    object CoinListScreen: Screen("coinList")
    object CoinDetailScreen: Screen("coinDetail")
}