package com.fanntt.lat23septembermic_fanntt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.lat23septembermic_fanntt.adapter.adapterGaleri3
import com.fanntt.lat23septembermic_fanntt.model.modelGaleri

class Galeri : AppCompatActivity() {

    private var recyleView: RecyclerView? = null
    private var galeriAdapter: adapterGaleri3? = null
    private var GaleriList =  mutableListOf<modelGaleri>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_galeri)

        GaleriList = ArrayList()
        recyleView = findViewById(R.id.rv_galeri)
        galeriAdapter = adapterGaleri3(this,GaleriList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(
            this,2
        )
        recyleView!!.layoutManager = layoutManager
        recyleView!!.adapter = galeriAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        prepareMovieList()
    }
    private fun prepareMovieList()
    {
        var Galery = modelGaleri("dua",R.drawable.dua)
        GaleriList.add(Galery)
        Galery = modelGaleri("tiga",R.drawable.tiga)
        GaleriList.add(Galery)
        Galery = modelGaleri("satu",R.drawable.satu)
        GaleriList.add(Galery)
        Galery = modelGaleri("lima",R.drawable.lima)
        GaleriList.add(Galery)
        Galery = modelGaleri("empat",R.drawable.empat)
        GaleriList.add(Galery)
        Galery = modelGaleri("enam",R.drawable.enam)
        GaleriList.add(Galery)
        
        galeriAdapter!!.notifyDataSetChanged()
    }
}