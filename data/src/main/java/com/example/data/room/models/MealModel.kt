package com.example.data.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MealModel(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val calories: Int,
    val time: Long
)