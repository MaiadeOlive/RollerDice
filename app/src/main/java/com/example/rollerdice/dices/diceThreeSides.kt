package com.example.rollerdice.dices

import android.widget.ImageView
import com.example.rollerdice.Dado
import com.example.rollerdice.R

class diceThreeSides(numLados: Int) : Dado(numLados) {
    // Escolhe qual imagem será exibida de acordo com o número informado
    fun changeDice(rolarDados: Int, diceImage: ImageView) {
        val drawableResourse = when (rolarDados) {
            1 -> R.drawable.dice3s_n1
            2 -> R.drawable.dice3s_n2
            else -> R.drawable.dice3s_n3
        }
        // Adiciona a imagem
        return diceImage.setImageResource(drawableResourse)
    }

}