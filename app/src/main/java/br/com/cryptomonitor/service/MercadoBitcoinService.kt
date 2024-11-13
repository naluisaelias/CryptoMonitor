package br.com.cryptomonitor.service

import retrofit2.Response
import retrofit2.http.GET
import br.com.cryptomonitor.model.TickerResponse

interface MercadoBitcoinService{
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}