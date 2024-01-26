package com.example.actividadcorrutinaspmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actividadcorrutinaspmdm.Corrutinas.ui.CorrutinasViewModel
import com.example.actividadcorrutinaspmdm.Corrutinas.ui.Screens
import com.example.actividadcorrutinaspmdm.ui.theme.ActividadCorrutinasPMDMTheme

class MainActivity : ComponentActivity() {
    private val CorrutinasViewModel: CorrutinasViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActividadCorrutinasPMDMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screens(CorrutinasViewModel)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActividadCorrutinasPMDMTheme {}
}




