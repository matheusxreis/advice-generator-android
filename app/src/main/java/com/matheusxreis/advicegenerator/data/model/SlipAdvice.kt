package com.matheusxreis.advicegenerator.data.model

import com.google.gson.annotations.SerializedName

data class SlipAdvice(
    @SerializedName("slip")
    public val slip: Advice
)
