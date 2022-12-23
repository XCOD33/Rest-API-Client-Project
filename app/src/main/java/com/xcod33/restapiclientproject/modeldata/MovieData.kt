package com.xcod33.restapiclientproject.modeldata

import com.google.gson.annotations.SerializedName

class MovieData (
    val Year:String?,
    val Title: String?,
    @SerializedName("Poster") val gambar:String
        )