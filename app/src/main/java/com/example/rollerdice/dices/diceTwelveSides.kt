package com.example.rollerdice.dices

import android.widget.ImageView
import com.example.rollerdice.Dado
import com.example.rollerdice.R

class diceTwelveSides(numLados: Int) : Dado(numLados) {
    // Escolhe qual imagem será exibida de acordo com o número informado
    fun changeDice(rolarDados: Int, diceImage: ImageView) {
        val drawableResourse = when (rolarDados) {
            1 -> R.drawable.dice12s_n1
            2 -> R.drawable.dice12s_n2
            3 -> R.drawable.dice12s_n3
            4 -> R.drawable.dice12s_n4
            5 -> R.drawable.dice12s_n5
            6 -> R.drawable.dice12s_n6
            7 -> R.drawable.dice12s_n7
            8 -> R.drawable.dice12s_n8
            9 -> R.drawable.dice12s_n9
            10 -> R.drawable.dice12s_n10
            11 -> R.drawable.dice12s_n11
            else -> R.drawable.dice12s_n12
        }
        // Adiciona a imagem
        return diceImage.setImageResource(drawableResourse)
    }
}