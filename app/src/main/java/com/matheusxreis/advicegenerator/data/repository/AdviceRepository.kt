package com.matheusxreis.advicegenerator.data.repository

import com.matheusxreis.advicegenerator.data.model.Advice
import com.matheusxreis.advicegenerator.data.model.SlipAdvice
import com.matheusxreis.advicegenerator.data.service.AdviceService
import com.matheusxreis.advicegenerator.data.utils.NetworkUtils

class AdviceRepository{


    fun getAdvice():SlipAdvice {
        return NetworkUtils().AdviceService().getAdvice()
    }
}