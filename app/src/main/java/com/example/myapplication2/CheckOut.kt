package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ncorti.slidetoact.SlideToActView

class CheckOut : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)

        val add1 = findViewById<Button>(R.id.add1)
        add1.setOnClickListener {
            val intent = Intent(this@CheckOut, Home::class.java)
            startActivity(intent)
            finish()
        }
        val add2 = findViewById<Button>(R.id.add2)
        add2.setOnClickListener {
            val intent = Intent(this@CheckOut, Home::class.java)
            startActivity(intent)
            finish()
        }
        val add3 = findViewById<Button>(R.id.add3)
        add3.setOnClickListener {
            val intent = Intent(this@CheckOut, Home::class.java)
            startActivity(intent)
            finish()
        }

        val slide = findViewById<SlideToActView>(R.id.slider)
        slide.animDuration = 600
        slide.bumpVibration = 500
        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                val add1: Button = findViewById(R.id.add1)
                val add2: Button = findViewById(R.id.add2)
                val add3: Button = findViewById(R.id.add3)

                add1.isEnabled = true
                add2.isEnabled = true
                add3.isEnabled = true
            }
        }
    }
}