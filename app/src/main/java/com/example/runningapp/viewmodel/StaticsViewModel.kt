package com.example.runningapp.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runningapp.repositories.MainRepository
import dagger.hilt.android.AndroidEntryPoint


class StaticsViewModel @ViewModelInject constructor(
    private val repository: MainRepository
): ViewModel() {
}