package com.example.pdmlabo4.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pdmlabo4.model.task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class GeneralViewModel: ViewModel() {
    private val _tasks = MutableStateFlow<MutableList<task.Task>>(mutableListOf())
    val tasks = _tasks.asStateFlow()

    fun addTask(task: task.Task) {
        _tasks.value = _tasks.value.toMutableList().apply { add(task) }
    }
}