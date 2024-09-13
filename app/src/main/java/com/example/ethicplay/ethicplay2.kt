package com.example.ethicplay

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ethicplay2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ethicplay2)

        val signin=findViewById<TextView>(R.id.signin)
         signin.setOnClickListener {
             intent= Intent(applicationContext,ethicplay3::class.java)
             startActivity(intent)
         }

    }
}