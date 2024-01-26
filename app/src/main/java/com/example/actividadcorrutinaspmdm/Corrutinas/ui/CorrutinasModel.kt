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

class CorrutinasViewModel : ViewModel() {

    var resultState by mutableStateOf("")
    private var callCount by mutableStateOf(0)
    private var color by mutableStateOf(false)

    fun CambiaColor() { color = !color }

    fun Colores() = if (color) Color.Blue else Color.Red

    /*
    fun bloqueoApp() {
        Thread.sleep(5000)
        callCount = callCount.plus(1)
        resultState = "Respuesta de la API $callCount"
    }*/

    fun fetchData() {
        callCount = callCount.plus(1)
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                delay(5000)
                "Respuesta de la API ($callCount)"
            }
            resultState = result
        }
    }
}