package com.example.pdmlabo4.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pdmlabo4.TodoApplication
import com.example.pdmlabo4.ui.HomeScreen
import com.example.pdmlabo4.ui.TODOScreen


@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val context = LocalContext.current.applicationContext as TodoApplication
    val viewModel: GeneralViewModel = viewModel(
        factory = GeneralViewModel.Factory(context.database.appDao())
    )

    NavHost(
        navController = navController,
        startDestination = "home_screen",
        modifier = modifier
    ) {
        composable("home_screen") {
            HomeScreen(onNavigateToList = {
                navController.navigate("todo_screen")
            })
        }

        composable("todo_screen") {
            TODOScreen(viewModel = viewModel)
        }
    }
}
