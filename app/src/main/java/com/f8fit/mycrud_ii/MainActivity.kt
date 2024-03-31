package com.f8fit.mycrud_ii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.f8fit.mycrud_ii.home.HomeScreen
import com.f8fit.mycrud_ii.home.HomeViewModel
import com.f8fit.mycrud_ii.home.ProductService
import com.f8fit.mycrud_ii.ui.theme.MyCrud_IITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCrud_IITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel = HomeViewModel(ProductService.instance)
                    HomeScreen(viewModel)
                }
            }
        }
    }
}