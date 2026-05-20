package com.example.pdmlabo4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.pdmlabo4.ui.theme.Pdmlabo4Theme
import com.example.pdmlabo4.viewmodel.AppNavigation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pdmlabo4Theme {
                AppNavigation()
            }

        }
    }
}
