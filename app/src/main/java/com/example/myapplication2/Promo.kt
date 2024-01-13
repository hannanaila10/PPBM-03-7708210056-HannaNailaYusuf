package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Promo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promo)

        val bac = findViewById<ImageView>(R.id.backBtn)
        bac.setOnClickListener {
            val intent = Intent(this@Promo, Home::class.java)
            startActivity(intent)
        }
    }
}