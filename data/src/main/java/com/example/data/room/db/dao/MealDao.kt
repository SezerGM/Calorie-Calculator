package com.example.data.room.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface MealDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeal(calories: Int, date: Long)
}