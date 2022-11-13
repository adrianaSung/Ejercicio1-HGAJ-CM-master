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
        var anio= bundle?.getInt("anio",0)

        edad.toString()

        print(tuCumple)

        binding2.tvNombre2.text = getString(R.string.tv_resultado_nombre, nombre)
        binding2.tvCumpleanos.text= ("Cumpleaños:"+tuCumple.toString())
        binding2.tvNumerodeCuenta.text= ("Número de cuenta:"+cuenta.toString())
        binding2.CorreitoTv.text= ("Correo:"+correo.toString())
        binding2.tvEdad.text= ("Tu edad es: "+edad.toString())

        if (dia != null && mes != null) {

            if(mes == 3 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.aries)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.piscis)
                }
            }
            if(mes == 4 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.tauro)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.aries)
                }
            }
            if(mes == 2 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.piscis)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.acuario)
                }
            }
            if(mes == 1 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.acuario)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.capricornio)
                }
            }
            if(mes == 5 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.geminis)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.tauro)
                }
            }
            if(mes == 6 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.cancer)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.geminis)
                }
            }
            if(mes == 7 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.leo)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.cancer)
                }
            }
            if(mes == 8 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.virgo)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.leo)
                }
            }
            if(mes == 9 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.libra)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.virgo)
                }
            }
            if(mes == 10 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.escorpion)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.libra)
                }
            }
            if(mes == 11 )
            {
                if(dia >= 21){
                    binding2.ImagenSigno.setImageResource(R.drawable.sagitario)

                } else{
                    binding2.ImagenSigno.setImageResource(R.drawable.escorpion)
                }
            }
            }
        if(anio!= null){
            if(anio == 1936 || anio== 1948 || anio == 1960 || anio== 1972 || anio == 1984 || anio == 1996 || anio ==2008 ){
                binding2.imageChino.setImageResource(R.drawable.rata)
            }
            if(anio == 1937 || anio== 1949 || anio == 1961 || anio== 1973 || anio == 1985 || anio == 1997 || anio ==2009 ){
                binding2.imageChino.setImageResource(R.drawable.toro)
            }
            if(anio == 1938 || anio== 1950 || anio == 1962 || anio== 1973 || anio == 1986 || anio == 1998 || anio ==2010 ){
                binding2.imageChino.setImageResource(R.drawable.tigre)
            }
            if(anio == 1939 || anio== 1951 || anio == 1963 || anio== 1974 || anio == 1987 || anio == 1999 || anio ==2011 ){
                binding2.imageChino.setImageResource(R.drawable.conejo)}

            if(anio == 1940 || anio== 1952 || anio == 1964 || anio== 1975 || anio == 1988 || anio == 2000 || anio ==2012 ){
                binding2.imageChino.setImageResource(R.drawable.dragon)
            }
            if(anio == 1941 || anio== 1953 || anio == 1965 || anio== 1976 || anio == 1989 || anio == 2001 || anio ==2013 ){
                binding2.imageChino.setImageResource(R.drawable.serpiente)
            }
            if(anio == 1942 || anio== 1954 || anio == 1966 || anio== 1977 || anio == 1990 || anio == 2002 || anio ==2014 ){
                binding2.imageChino.setImageResource(R.drawable.caballo)
            }
            if(anio == 1943 || anio== 1955 || anio == 1967 || anio== 1978 || anio == 1991 || anio == 2003 || anio ==2015 ){
                binding2.imageChino.setImageResource(R.drawable.borrego)
            }
            if(anio == 1944 || anio== 1956 || anio == 1969 || anio== 1979 || anio == 1992 || anio == 2004 || anio ==2016 ){
                binding2.imageChino.setImageResource(R.drawable.mono)
            }
            if(anio == 1945 || anio== 1957 || anio == 1970 || anio== 1980 || anio == 1993 || anio == 2005 || anio ==2017 ){
                binding2.imageChino.setImageResource(R.drawable.gallina)
            }
            if(anio == 1946 || anio== 1958 || anio == 1971 || anio== 1981 || anio == 1994 || anio == 2006 || anio ==2018 ){
                binding2.imageChino.setImageResource(R.drawable.perro)
            }
            if(anio == 1947 || anio== 1959 || anio == 1972 || anio== 1982 || anio == 1995 || anio == 2007 || anio ==2019 ){
                binding2.imageChino.setImageResource(R.drawable.bufalo)
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