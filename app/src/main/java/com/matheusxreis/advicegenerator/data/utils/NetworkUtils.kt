package com.matheusxreis.advicegenerator.data.utils

import com.matheusxreis.advicegenerator.data.service.AdviceService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    var retrofit = Retrofit.Builder()
        .baseUrl(Constants.baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun AdviceService():AdviceService{
      return retrofit.create(com.matheusxreis.advicegenerator.data.service.AdviceService::class.java)
    }
}