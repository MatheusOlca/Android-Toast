package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll : Button = findViewById(R.id.button)
        buttonRoll.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
    }
}