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


        if(binding.tvNombre.text.toString().isEmpty()){
            Toast.makeText(this,"Coloca tu nombre", Toast.LENGTH_LONG).show()
            binding.tvNombre.error = getString(R.string.nombre_vacio)



        }else{
            if(binding.tvFecha1.text.toString().isEmpty()){
                Toast.makeText(this,"Coloca tu fecha de nacimiento", Toast.LENGTH_LONG).show()


            }else{
                if(binding.tvNumeroDeC.text.toString().isEmpty()){
                    Toast.makeText(this,"Coloca tu numero de cuenta", Toast.LENGTH_LONG).show()
                    binding.tvNombre.error = getString(R.string.numerodecuenta_vacio)

                }else{
                    if(binding.tvEmail.text.toString().isEmpty()){
                        Toast.makeText(this,"Coloca tu email", Toast.LENGTH_LONG).show()


                    }else{
                        Toast.makeText(this,"Formulario completo :)", Toast.LENGTH_LONG).show()
                        val intent = Intent(this,MainActivity2::class.java)
                        val parametros = Bundle()



                        if(isValidString(binding.tvEmail.text.toString())) {
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
                            parametros.putInt("mes",mes)
                            parametros.putInt("anio",anio)



                            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                            intent.putExtras(parametros)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this,"Correo no válido", Toast.LENGTH_LONG).show()
                            binding.tvEmail.error = getString(R.string.correo_no_valido)
                        }

                    }
                }
            }
        }


    }
    /*VALIDANDO CORREOS*/
    fun isValidString(str: String): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches()
    }

    /*VALIDANDO DATOS*/

    //fun validar(view: View){


    //}



}