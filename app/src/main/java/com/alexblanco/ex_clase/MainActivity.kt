package com.alexblanco.ex_clase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import kotlin.math.absoluteValue
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val diceImage: ImageView = findViewById(R.id.imageView)

        rollButton.setOnClickListener {

            val number = Random.nextInt(3)

            when (number) {
                0 -> diceImage.setImageResource(R.drawable.a)
                1 -> diceImage.setImageResource(R.drawable.b)
                2 -> diceImage.setImageResource(R.drawable.c)
            }

            val nom: EditText = findViewById(R.id.editTextText)
            val nombreUsuario = nom.text.toString()
            val mensaje = "Bienvenido: $nombreUsuario"
            val toast = Toast.makeText(this, mensaje, Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}