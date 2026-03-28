package com.example.data.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [], version = 1)
@TypeConverters(TimeConvertor::class)
abstract class RoomDb : RoomDatabase() {

}