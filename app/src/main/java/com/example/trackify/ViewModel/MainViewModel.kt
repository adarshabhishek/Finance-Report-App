package com.example.trackify.ViewModel

import androidx.lifecycle.ViewModel
import com.example.trackify.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())
    fun loadDate()=repository.items
    fun loadBudget()=repository.budget
}