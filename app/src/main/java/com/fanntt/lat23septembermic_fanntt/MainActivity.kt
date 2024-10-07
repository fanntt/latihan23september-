package com.fanntt.lat23septembermic_fanntt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btn1 : Button
    private lateinit var btn2 : Button
    private lateinit var btn3 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)


        btn1.setOnClickListener(){
            val intentMenu2 = Intent(this@MainActivity,
                MI::class.java)
            startActivity(intentMenu2)
        }
        btn2.setOnClickListener(){
            val intentMenu2 = Intent(this@MainActivity,
                Tekom::class.java)
            startActivity(intentMenu2)
        }
        btn3.setOnClickListener(){
            val intentMenu2 = Intent(this@MainActivity,
                Galeri::class.java)
            startActivity(intentMenu2)
        }


    }
}