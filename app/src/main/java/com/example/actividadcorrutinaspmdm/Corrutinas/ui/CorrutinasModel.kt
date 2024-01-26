package com.example.actividadcorrutinaspmdm.Corrutinas.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// Parte 1:

class CorrutinasViewModel : ViewModel() {

    var StateResultado by mutableStateOf("")
    private var callCount by mutableStateOf(0)
    private var color by mutableStateOf(false)

    fun CambiaColor() { color = !color }

    fun Colores() = if (color) Color.Blue else Color.Red

    fun bloqueoApp() {
        Thread.sleep(5000)
        callCount = callCount.plus(1)
        resultState = "Respuesta de la API $callCount"
    }
