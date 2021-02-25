package com.example.runningapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table") // Entity is nothing but just the table with multiple columns
data class Run(
    var img: Bitmap? = null,
    var timeStamp: Long = 0L, //this describes when we started to run
    var avgSpeedInKMH: Float = 0F,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L, //this describes how long we ran for
    var caloriesBurnt: Int = 0,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}