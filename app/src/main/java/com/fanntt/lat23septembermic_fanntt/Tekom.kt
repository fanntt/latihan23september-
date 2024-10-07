package com.fanntt.lat23septembermic_fanntt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tekom : AppCompatActivity() {

    private lateinit var btntekom : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tekom)

        btntekom=findViewById(R.id.btntekom)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btntekom.setOnClickListener(){
            val intentMenu2 = Intent(this@Tekom,
                MainActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}