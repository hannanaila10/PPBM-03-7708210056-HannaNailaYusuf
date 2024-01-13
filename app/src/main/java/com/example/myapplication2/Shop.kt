package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        val alamat = findViewById<TextView>(R.id.alamat)
        alamat.setOnClickListener {
            val intent = Intent(this@Shop, Address::class.java)
            startActivity(intent)
        }
        val cekot = findViewById<Button>(R.id.cekot)
        cekot.setOnClickListener {
            val intent = Intent(this@Shop, CheckOut::class.java)
            startActivity(intent)
        }
    }
}