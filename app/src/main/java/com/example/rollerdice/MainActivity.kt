package com.example.rollerdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.rollerdice.dices.diceSixSides
import com.example.rollerdice.dices.diceThreeSides
import com.example.rollerdice.dices.diceTwelveSides

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rolarDadoSix() }
        rolarDadoSix()
        val rollButton2: Button = findViewById(R.id.button2)
        rollButton2.setOnClickListener { rolarDadoThree() }
        rolarDadoThree()
        val rollButton3: Button = findViewById(R.id.button3)
        rollButton3.setOnClickListener { rolarDadoTwelve() }
        rolarDadoTwelve()
    }

    // Rola o dado de 6 lados
    private fun rolarDadoSix() {
        // Cria um dado com os lados informados
        val dado = diceSixSides(6)
        val rolarDados = dado.rolarDados()
        // Encontra a imageView
        val diceImage: ImageView = findViewById(R.id.imageView)
        // Altera o número do dado e a imagem
        dado.changeDice(rolarDados, diceImage)
        // Adiciona a descrição do número acertado
        diceImage.contentDescription = rolarDados.toString()
    }

    // Rola o dado de 3 lados
    private fun rolarDadoThree() {
        // Cria um dado com os lados informados
        val dado = diceThreeSides(3)
        val rolarDados = dado.rolarDados()
        // Encontra a imageView
        val diceImage: ImageView = findViewById(R.id.imageView2)
        // Altera o número do dado e a imagem
        dado.changeDice(rolarDados, diceImage)
        // Adiciona a descrição do número acertado
        diceImage.contentDescription = rolarDados.toString()
    }

    // Rola o dado de 12 lados
    private fun rolarDadoTwelve() {
        // Cria um dado com os lados informados
        val dado = diceTwelveSides(12)
        val rolarDados = dado.rolarDados()
        // Encontra a imageView
        val diceImage: ImageView = findViewById(R.id.imageView3)
        // Altera o número do dado e a imagem
        dado.changeDice(rolarDados, diceImage)
        // Adiciona a descrição do número acertado
        diceImage.contentDescription = rolarDados.toString()
    }
}