package com.example.ejerciciohgaj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ejerciciohgaj.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding2.root)

        var bundle = intent.extras

        var nombre = bundle?.getString("nombre","")
        var tuCumple =bundle?.getString("tuCumple","")
        var edad =bundle?.getInt("edad",0)
        var cuenta =bundle?.getString("numerodecuenta","")
        var correo = bundle?.getString("correo","")
        edad.toString()

        print(tuCumple)

        binding2.tvNombre2.text = getString(R.string.tv_resultado_nombre, nombre)
        binding2.tvCumpleanos.text= tuCumple.toString()
        binding2.tvNumerodeCuenta.text= cuenta.toString()
        binding2.tvCorreo2.text= correo.toString()


    }
    fun click(view:View){
        val intent= Intent(this,MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)

    }
}