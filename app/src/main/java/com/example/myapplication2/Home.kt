package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val sett = findViewById<ImageButton>(R.id.setting)
        sett.setOnClickListener {
            val intent = Intent(this@Home, Profile::class.java)
            startActivity(intent)
        }

        val promo = findViewById<ImageButton>(R.id.promo)
        promo.setOnClickListener {
            val intent = Intent(this@Home, Promo::class.java)
            startActivity(intent)
        }

        val ripiew = findViewById<Button>(R.id.ripiew)
        ripiew.setOnClickListener {
            val intent = Intent(this@Home, Shop::class.java)
            startActivity(intent)
        }

        val sayur = findViewById<Button>(R.id.sayur)
        sayur.setOnClickListener {
            val intent = Intent(this@Home, Utama::class.java)
            startActivity(intent)
        }

        val imageList = ArrayList<SlideModel>() // Create image list
        imageList.add(SlideModel(R.drawable.roti1, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.roti2, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.roti3, ScaleTypes.CENTER_INSIDE))
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}