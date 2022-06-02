package com.matheusxreis.advicegenerator.data.service

import com.matheusxreis.advicegenerator.data.model.Advice
import com.matheusxreis.advicegenerator.data.model.SlipAdvice
import retrofit2.http.GET

interface AdviceService {

    @GET("/advice")
    public fun getAdvice():SlipAdvice

}