package com.example.mvvmnavigationapp.ui.theme.screens.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigationapp.ui.theme.MVVMNavigationAppTheme

@Composable
fun LoginScreen(navController: NavHostController){
    Text(text = "Welcome to about page")
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    MVVMNavigationAppTheme {
        LoginScreen(rememberNavController())
    }
}