package com.example.data.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

enum class MealType{
    Breakfast, Lunch, Dinner, Snack
}

@Entity
data class MealModel(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val calories: Int,
    val time: Date,
    val mealType: MealType
)

data class MealDomainModel(
    val colories: Int,
    val time: Date,
    val mealType: MealType
)

private fun  MealModel.toDomain(): MealDomainModel = MealDomainModel(
    colories = calories,
    time = time,
    mealType = mealType
)