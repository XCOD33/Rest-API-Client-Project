package com.xcod33.restapiclientproject

import com.xcod33.restapiclientproject.modeldata.SearchData
import retrofit2.Call
import retrofit2.http.GET

interface ClientApi {
    @GET("?s=conjuring&apikey=b49ed15b")
    fun getMovies(): Call<SearchData>
}