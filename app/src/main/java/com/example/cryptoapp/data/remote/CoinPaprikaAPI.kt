package com.example.cryptoapp.data.remote

import com.example.cryptoapp.data.remote.dto.CoinDTO
import com.example.cryptoapp.data.remote.dto.CoinDetailDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaAPI {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDTO>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoin(@Path("coinId") coinId:String): CoinDetailDTO
}