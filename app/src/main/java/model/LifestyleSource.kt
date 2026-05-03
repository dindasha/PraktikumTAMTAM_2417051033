package com.example.praktikumtam_2417051033.model

import android.content.Context

object LifestyleSource {
    // Fungsi untuk mencari ID drawable berdasarkan nama file (String) dari API
    fun getResourceId(context: Context, imageName: String): Int {
        return context.resources.getIdentifier(imageName, "drawable", context.packageName)
    }
}
