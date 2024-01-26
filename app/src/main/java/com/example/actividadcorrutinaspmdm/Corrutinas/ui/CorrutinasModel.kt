package com.example.actividadcorrutinaspmdm.Corrutinas.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class CorrutinasViewModel : ViewModel() {

    var resultState by mutableStateOf("")

    private var callCount by mutableStateOf(0)

    private var color by mutableStateOf(false)

    fun changeColor() { color = !color }

    fun getColor() = if (color) Color.Blue else Color.Red

    fun bloqueoApp() {
        Thread.sleep(5000)
        callCount = callCount.plus(1)
        resultState = "Respuesta de la API $callCount"
    }
}