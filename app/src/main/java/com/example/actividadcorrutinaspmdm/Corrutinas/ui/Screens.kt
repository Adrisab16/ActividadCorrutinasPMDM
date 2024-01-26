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
        BotonColor(corrutinasViewModel)
        Text(text = corrutinasViewModel.resultState)
        Button(onClick = {
            corrutinasViewModel.bloqueoApp()
        }) {
            Text("Llamar API")
        }
    }
}

@Composable
fun BotonColor(homeViewModel: CorrutinasViewModel) {

    Button(
        onClick = { homeViewModel.changeColor() },
        colors = ButtonDefaults.buttonColors(containerColor = homeViewModel.getColor())
    ) {
        Text(text = "Cambiar color")
    }
}