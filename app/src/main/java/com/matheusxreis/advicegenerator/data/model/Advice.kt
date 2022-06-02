package com.matheusxreis.advicegenerator.data.model

import com.google.gson.annotations.SerializedName

data class Advice(

    @SerializedName("id")
    private val id: Number,

    @SerializedName("advice")
    private val advice: String
)