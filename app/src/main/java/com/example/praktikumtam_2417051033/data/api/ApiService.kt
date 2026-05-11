package com.example.praktikumtam_2417051033.data.api

import com.example.praktikumtam_2417051033.data.model.Lifestyle
import retrofit2.http.GET

interface ApiService {

    @GET("Lifestyle_data.json")
    suspend fun getLifestyles(): List<Lifestyle>

}