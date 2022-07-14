package com.example.to_do_jetpackcomposemvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.to_do_jetpackcomposemvvm.data.models.repositories.ToDoRepository
import com.example.to_do_jetpackcomposemvvm.navigation.SetupNavigation
import com.example.to_do_jetpackcomposemvvm.ui.theme.ToDoJetpackComposeMVVMTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoJetpackComposeMVVMTheme {
                navController = rememberNavController()
                SetupNavigation(navController = navController)

            }
        }
    }
}

