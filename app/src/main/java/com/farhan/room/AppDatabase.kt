package com.farhan.room

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by FA on 5/30/2022.
 */
@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}