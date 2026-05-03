package com.example.praktikumtam_2417051033.model
import com.google.gson.annotations.SerializedName

data class Lifestyle(
    @SerializedName("title")
    val title: String,

    @SerializedName("date")
    val date: String,

    @SerializedName("mood")
    val mood: String,

    @SerializedName("note")
    val note: String,

    @SerializedName("image_url")
    val imageUrl: String
)