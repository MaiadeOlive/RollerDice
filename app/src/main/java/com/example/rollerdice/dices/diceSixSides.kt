package com.example.rollerdice.dices

import android.widget.ImageView
import com.example.rollerdice.Dado
import com.example.rollerdice.R

class diceSixSides(numLados: Int) : Dado(numLados) {
    // Escolhe qual imagem será exibida de acordo com o número informado
    fun changeDice(rolarDados: Int, diceImage: ImageView) {
        val drawableResourse = when (rolarDados) {
            1 -> R.drawable.dice6s_n1
            2 -> R.drawable.dice6s_n2
            3 -> R.drawable.dice6s_n3
            4 -> R.drawable.dice6s_n4
            5 -> R.drawable.dice6s_n5
            else -> R.drawable.dice6s_n6
        }
        // Adiciona a imagem
        return diceImage.setImageResource(drawableResourse)
    }

}