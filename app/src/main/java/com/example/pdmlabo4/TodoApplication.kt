package com.example.pdmlabo4

import android.app.Application
import com.example.pdmlabo4.Data.Local.AppDatabase

class TodoApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
