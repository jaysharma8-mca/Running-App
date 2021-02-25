package com.example.runningapp.repositories

import com.example.runningapp.db.Run
import com.example.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDao: RunDAO
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    //Since it returns live data which is asynchronous so no need to make it suspend
    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedAverageSpeed()

    fun getAllRunsSortedByCaloriesBurnt() = runDao.getAllRunsSortedByCaloriesBurnt()

    fun getTotalAverageSpeed() = runDao.getTotalAverageSpeed()

    fun getTotalDistance() = runDao.getTotalDistanceInMeters()

    fun getTotalCaloriesBurnt() = runDao.getTotalCaloriesBurnt()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()
}