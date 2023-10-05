package com.example.cryptoapp.data.repositories

import com.example.cryptoapp.data.remote.CoinPaprikaAPI
import com.example.cryptoapp.data.remote.dto.CoinDTO
import com.example.cryptoapp.data.remote.dto.CoinDetailDTO
import com.example.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaAPI
): CoinRepository{

    override suspend fun getCoins(): List<CoinDTO> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId:String): CoinDetailDTO {
        return api.getCoin(coinId)
    }

}