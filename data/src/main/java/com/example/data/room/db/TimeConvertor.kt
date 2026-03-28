package com.example.data.room.db

import androidx.room.TypeConverter
import java.util.Date


class TimeConvertor {
    @TypeConverter
    fun longToTime(value: Long): Date?{
        return Date(value)
    }

    @TypeConverter
    fun timeToLong(value: Date): Long? {
        return  value.time
    }
}