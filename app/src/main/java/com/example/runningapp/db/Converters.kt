package com.example.runningapp.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {

    @TypeConverter // Since the function will be used by RoomDb and this function converts out bitmap so annotated with type converter
    fun fromBitmap(bmp: Bitmap): ByteArray{
        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }

    @TypeConverter // Since the function will be used by RoomDb and this function converts out bitmap so annotated with type converter
    fun toBitmap(bytes: ByteArray): Bitmap{
       return  BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
    }
}