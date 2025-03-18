package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.bmi.screens.BMIResultSreern
import br.senai.sp.jandira.bmi.screens.TelaInical
import br.senai.sp.jandira.bmi.screens.UserDataScreen
import br.senai.sp.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BMITheme {
                var navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "home"
                ){
                    composable(
                        route = "home"
                    ){
                        TelaInical(navController)
                    }
                    composable(
                        route = "user_data"
                    ){
                        UserDataScreen(navController)
                    }
                    composable(
                        route = "result_sreern"
                    ){
                        BMIResultSreern(navController)
                    }
                }
            }
        }
    }
}