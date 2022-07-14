package com.example.to_do_jetpackcomposemvvm.navigation

import androidx.navigation.NavHostController
import com.example.to_do_jetpackcomposemvvm.util.Action
import com.example.to_do_jetpackcomposemvvm.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}"){
            popUpTo(LIST_SCREEN){inclusive = true}
        }
    }

    val task: (Int) -> Unit = {
        taskId-> navController.navigate("task/$taskId")
    }

}