package com.example.pmdm_examenordinaria_davidjalon.data.api

import com.example.pmdm_examenordinaria_davidjalon.data.model.Pais
import retrofit2.http.GET
import retrofit2.http.Path

interface PaisApiService {

    @GET("https://restcountries.com/v3.1/region/europe?fields=translations,capital,latlng,borders,flags,population")
    suspend fun getEuropa(@Path("categoryName") category: String): List<Pais>

    @GET("https://restcountries.com/v3.1/region/america?fields=translations,capital,latlng,borders,flags,population")
    suspend fun getAmerica(@Path("categoryName") category: String): List<Pais>

    @GET("https://restcountries.com/v3.1/region/asia?fields=translations,capital,latlng,borders,flags,population")
    suspend fun getAsia(@Path("categoryName") category: String): List<Pais>

    @GET("https://restcountries.com/v3.1/region/africa?fields=translations,capital,latlng,borders,flags,population")
    suspend fun getAfrica(@Path("categoryName") category: String): List<Pais>

    @GET("https://restcountries.com/v3.1/region/oceania?fields=translations,capital,latlng,borders,flags,population")
    suspend fun getOceania(@Path("categoryName") category: String): List<Pais>

}