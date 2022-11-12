package com.example.ejerciciohgaj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.ejerciciohgaj.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    var edad:Int = 0
    var nombre: String = ""
    var numerodecuenta: String= ""
    var correo: String=""
    var tuCumple: String= ""
    var mes: Int= 0
    var dia: Int= 0
    var anio: Int= 0
    lateinit var imagenS: ImageView






    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvTitulo.text ="Ingresa datos"






        binding.tvFecha1.setOnClickListener { showDatePickerDialog() }


    }


    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment{day, month ,year -> onDateSelected(day, (month+1), year)}
        datePicker.show(supportFragmentManager, "datepicker")


    }
    fun onDateSelected(day: Int, month:Int, year: Int){
      /*  binding.tvFecha1.setText("$day/$month/$year")*/
        binding.tvFecha1.setText(getString(R.string.fecha_de_nacimiento, day, month, year))


        var tuCumple = "$day/$month/$year"
        dia = day
        mes = month
        anio= year
        lateinit var cumple: Date
        try {
            cumple = SimpleDateFormat("dd/MM/yyyy").parse(tuCumple)
        }
        catch (e: Exception){
            println(e)
        }
        var ahora= Date(System.currentTimeMillis())
        var edadactual=ahora.getTime() -cumple.getTime()
        var sec = edadactual/1000
        var minutos = sec/60
        var horas = minutos/ 60
        var dias= horas/24

        edad =  (dias/365).toInt()


        println("Tu edad es $edad")



    }


    fun setLocale(codigoIdioma:String){
        val config = resources.configuration
        val locale= Locale(codigoIdioma)
        Locale.setDefault(locale)

        config.setLocale(locale)

        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N)
            createConfigurationContext(config)

        resources.updateConfiguration(config, resources.displayMetrics)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun click_idioma(view: View) {

        when(view.id) {
            R.id.buttonIdioma -> {
                setLocale("en")
            }

            R.id.buttonEsp -> {
                setLocale("es")
            }
        }

    }
    fun click(view: View){
        val intent = Intent(this,MainActivity2::class.java)
        val parametros = Bundle()



        nombre = binding.tvNombre.text.toString()
        numerodecuenta = binding.tvNumeroDeC.text.toString()
        correo = binding.tvEmail.text.toString()
        tuCumple = binding.tvFecha1.text.toString()




        parametros.putString("nombre",nombre)
        parametros.putInt("edad",edad)
        parametros.putString("numerodecuenta",numerodecuenta)
        parametros.putString("tuCumple",tuCumple)
        parametros.putString("correo",correo)
        parametros.putInt("dia",dia)
        parametros.putInt("dia",mes)
        parametros.putInt("anio",anio)










        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        intent.putExtras(parametros)
        startActivity(intent)



    }



}