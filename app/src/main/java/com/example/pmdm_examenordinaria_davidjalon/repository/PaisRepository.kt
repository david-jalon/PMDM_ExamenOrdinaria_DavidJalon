package com.example.pmdm_examenordinaria_davidjalon.repository

import com.example.pmdm_examenordinaria_davidjalon.data.api.RetrofitClient

class PaisRepository() {
    private val api = RetrofitClient.api

    suspend fun getEuropa(category: String) = api.getEuropa(category)
    suspend fun getAmerica(category: String) = api.getAmerica(category)
    suspend fun getAsia(category: String) = api.getAsia(category)
    suspend fun getAfrica(category: String) = api.getAfrica(category)
    suspend fun getOceania(category: String) = api.getOceania(category)

}