package com.example.pdmlabo4.model

import java.util.Date

class task {
    data class Task (
        val id: Int,
        val title: String,
        val description: String,
        val endDate: Date = Date(),
        val isCompleted: Boolean = false
    )
}