package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val sett = findViewById<ImageView>(R.id.backBtn)
        sett.setOnClickListener {
            val intent = Intent(this@Profile, Home::class.java)
            startActivity(intent)
        }

        val tab = findViewById<Button>(R.id.about)
        tab.setOnClickListener {
            val intent = Intent(this@Profile, TabLay::class.java)
            startActivity(intent)
        }

        val status =
            arrayOf("Menikah", "Single")

        val spinner = findViewById<Spinner>(R.id.spinner)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, status)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
            }
        }