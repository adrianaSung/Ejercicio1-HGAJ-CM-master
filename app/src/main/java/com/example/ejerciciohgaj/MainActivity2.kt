package com.example.ejerciciohgaj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.ejerciciohgaj.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
  //  var imSigno : String = ""
    private lateinit var binding2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)

        //binding2.ImagenSigno.


        setContentView(binding2.root)

        val bundle = intent.extras

        var nombre = bundle?.getString("nombre","")
        var tuCumple =bundle?.getString("tuCumple","")
        var cuenta =bundle?.getString("numerodecuenta","")
        var correo = bundle?.getString("correo","")
        var edad =bundle?.getInt("edad",0)
        var dia= bundle?.getInt("dia",0)
        var mes= bundle?.getInt("mes",0)
        //var anio= bundle?.getInt("anio",0)

        edad.toString()

        print(tuCumple)

        binding2.tvNombre2.text = getString(R.string.tv_resultado_nombre, nombre)
        binding2.tvCumpleanos.text= ("Cumpleaños:"+tuCumple.toString())
        binding2.tvNumerodeCuenta.text= ("Número de cuenta:"+cuenta.toString())
        binding2.CorreitoTv.text= ("Correo:"+correo.toString())
        binding2.tvEdad.text= ("Tu edad es: "+edad.toString())

        if (dia != null && mes != null) {
            if(mes == 4 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.aries)

                }
            }
            }

          /* if(dia <= 24 && dia >=14 &&mes <= 5 && mes == 6){
                binding2.ImagenSigno.setImageResource(R.drawable.tauro)

            }
            if(dia <= 25 && dia >=20 &&mes <= 6 && mes == 7){
                binding2.ImagenSigno.setImageResource(R.drawable.geminis)

            }
            if(dia >= 21 && dia >=19 &&mes <= 7 && mes == 8){
                binding2.ImagenSigno.setImageResource(R.drawable.cancer)

            }
            if(dia <= 20 && dia >=14 &&mes <= 8 && mes == 9){
                binding2.ImagenSigno.setImageResource(R.drawable.leo)

            }
            if(dia <= 24 && dia >=22 &&mes <= 9 && mes == 10){
                binding2.ImagenSigno.setImageResource(R.drawable.virgo)

            }
            if(dia <= 20 && dia >=14 &&mes <= 8 && mes == 9){
                binding2.ImagenSigno.setImageResource(R.drawable.leo)

            }
            if(dia <= 20 && dia >=14 &&mes <= 8 && mes == 9){
                binding2.ImagenSigno.setImageResource(R.drawable.leo)

            }


        }*/
    }


    fun click(view:View){
        val intent= Intent(this,MainActivity::class.java)
       // intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)

    }
}