package com.example.pmdm_examenordinaria_davidjalon.data.api


object RetrofitClient {
    private const val BASE_URL = "https://restcountries.com/v3.1/"

    val api: PaisApiService by lazy {
        retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
            .build()
            .create(PaisApiService::class.java)
    }
}