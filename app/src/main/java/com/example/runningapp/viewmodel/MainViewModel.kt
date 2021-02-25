package com.example.runningapp.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runningapp.repositories.MainRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: MainRepository
):ViewModel() {
}