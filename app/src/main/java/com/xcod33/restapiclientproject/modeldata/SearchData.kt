package com.xcod33.restapiclientproject.modeldata

import com.google.gson.annotations.SerializedName

class SearchData (
    @SerializedName("Search") val data:List<MovieData>,
    @SerializedName("totalResults") val totalData:Int
        )