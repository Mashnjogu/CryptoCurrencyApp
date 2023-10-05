package com.example.cryptoapp.domain.repository

import com.example.cryptoapp.data.remote.dto.CoinDTO
import com.example.cryptoapp.data.remote.dto.CoinDetailDTO

interface CoinRepository {

    suspend fun getCoins(): List<CoinDTO>

    suspend fun getCoinById(coinId: String): CoinDetailDTO
}