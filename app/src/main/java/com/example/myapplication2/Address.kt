package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Address : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat)

        val cekot = findViewById<Button>(R.id.submit)
        cekot.setOnClickListener {
            val intent = Intent(this@Address, Shop::class.java)
            startActivity(intent)
        }
    }
}