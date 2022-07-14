package com.example.to_do_jetpackcomposemvvm.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.to_do_jetpackcomposemvvm.util.Action
import com.example.to_do_jetpackcomposemvvm.util.Constants
import com.example.to_do_jetpackcomposemvvm.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(navigateToListScreen : (Action) -> Unit){
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ){

    }
}