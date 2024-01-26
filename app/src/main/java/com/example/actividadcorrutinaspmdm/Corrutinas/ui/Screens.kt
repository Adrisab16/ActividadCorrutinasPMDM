package com.example.actividadcorrutinaspmdm.Corrutinas.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun Screens(corrutinasViewModel: CorrutinasViewModel) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ColorButton(corrutinasViewModel)
        Text(text = corrutinasViewModel.resultState)
        Button(onClick = { corrutinasViewModel.fetchData() }) { Text("Llama a la API") }
    }
}

@Composable
fun ColorButton(corrutinasViewModel: CorrutinasViewModel) {
    Button(
        onClick = { corrutinasViewModel.CambiaColor() },
        colors = ButtonDefaults.buttonColors(containerColor = corrutinasViewModel.Colores())
    ) { Text(text = "Pulsa para cambiar color") }
}