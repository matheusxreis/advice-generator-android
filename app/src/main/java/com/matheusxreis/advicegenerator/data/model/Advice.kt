package com.matheusxreis.advicegenerator.data.model

import com.google.gson.annotations.SerializedName

data class Advice(

    @SerializedName("id")
    public val id: Number,

    @SerializedName("advice")
    public val advice: String
)