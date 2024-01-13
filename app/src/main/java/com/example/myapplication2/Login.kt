package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginn)

        var _isianU = findViewById<EditText>(R.id.username)
        var _isianP = findViewById<EditText>(R.id.pass)
        var _btnLog = findViewById<Button>(R.id.LOGIN)

        _btnLog.setOnClickListener {

            var textU = _isianU.text.toString()
            var textP = _isianP.text.toString()

            Log.d("galih", "isian u: " + textU)
            Log.d("galih", "isian p: " + textP)

            if (textU == "" || textP == "") {
                Toast.makeText(
                    this, "username dan password jangan kosong",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                // B - pindah ke activity lain
                val _inten = Intent(this, Home::class.java)
                startActivity(_inten)
            }
        }

        val register = findViewById<Button>(R.id.registrasi)
        register.setOnClickListener {
            val intent = Intent(this@Login, Registrasi::class.java)
            startActivity(intent)
            finish()
        }
    }
}