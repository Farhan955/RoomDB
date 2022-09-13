package com.farhan.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _init_()
    }

    private fun _init_() {

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "data"
        ).allowMainThreadQueries()
            .build()

        val userDao = db.userDao()
        userDao.insertAll(User(1,"fa","ar"))

        val users: List<User> = userDao.getAll()
        Log.d("farhan",users.toString())

    }

}