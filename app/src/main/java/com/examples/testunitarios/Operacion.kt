package com.examples.testunitarios

class Operacion {
    fun suma(numero1: String?, numero2: String?): String {
        val resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2)
        return resultado.toString()
    }

    fun resta(numero1: String?, numero2: String?): String {
        val resultado = Integer.valueOf(numero1) - Integer.valueOf(numero2)
        return resultado.toString()
    }

    fun multiplicar(numero1: String?, numero2: String?): String {
        val resultado = Integer.valueOf(numero1) * Integer.valueOf(numero2)
        return resultado.toString()
    }
}