package com.example.praktikumtam_2417051033.data.repository

import com.example.praktikumtam_2417051033.data.api.RetrofitClient
import com.example.praktikumtam_2417051033.data.model.Lifestyle

class LifestyleRepository {

    suspend fun getLifestyles(): List<Lifestyle> {
        return try {
            RetrofitClient.instance.getLifestyles()
        } catch (_: Exception) {
            emptyList()
        }
    }
}