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

    //Parte 2 - Pruebas.

    var StateResultado by mutableStateOf("")
    private var callCount by mutableStateOf(0)
    private var color by mutableStateOf(false)

    fun CambiaColor() { color = !color }

    fun Colores() = if (color) Color.Blue else Color.Red

    /*
    fun fetchData() {
        callCount = callCount.plus(1)
        viewModelScope.launch {
            val resultado = withContext(Dispatchers.IO)
        {
                delay(5000)
                "Respuesta de la API ($callCount)"
            }
            StateResultado = resultado
        }
    }
     */

    fun fetchData() {
        var isLoading: Boolean
        viewModelScope.launch {
            try {
                isLoading = true
                llamarApi()
            } catch (e: Exception) {
                println("Error ${e.message}")
            } finally {
                isLoading = false
            }
        }
    }

    private suspend fun llamarApi() {
        val result = withContext(Dispatchers.IO) {
            delay(5000)
            "Respuesta de la API"
        }
        StateResultado = result
    }
}
