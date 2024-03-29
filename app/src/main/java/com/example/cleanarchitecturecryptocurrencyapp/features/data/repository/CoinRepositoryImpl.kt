package com.example.cryptocurrencycleanarchitecture.data.repository

import com.example.cryptocurrencycleanarchitecture.common.Resource
import com.example.cryptocurrencycleanarchitecture.data.remote.CoinPaprikaApi
import com.example.cryptocurrencycleanarchitecture.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencycleanarchitecture.data.remote.dto.CoinDto
import com.example.cryptocurrencycleanarchitecture.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

      override suspend fun getCoins(): List<CoinDto> {
          return api.getCoins()
      }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
       return api.getCoinById(coinId)
    }
}