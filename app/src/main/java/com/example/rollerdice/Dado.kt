package com.example.rollerdice


open class Dado(private val numLados: Int) {
    // Determina um número aleatório
    fun rolarDados(): Int {
        return (1..numLados).random()
    }
}