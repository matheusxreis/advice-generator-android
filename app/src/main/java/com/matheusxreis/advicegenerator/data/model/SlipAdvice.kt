package com.matheusxreis.advicegenerator.data.model

import com.google.gson.annotations.SerializedName

data class SlipAdvice(
    @SerializedName("slip")
    private val slip: Advice
)
