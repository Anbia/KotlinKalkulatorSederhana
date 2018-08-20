package com.kodeanbia.kotlinkalkulatorsederhana

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    val a :String? = null
//    val b :String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun penjumlahan(view: View){

        val a = angka1.text.toString().toInt()
        val b = angka2.text.toString().toInt()

        val hasilnya = a + b

        textViewHasil.text = "Hasil : $hasilnya"
    }

    fun pengurangan(view: View){

        val a = angka1.text.toString().toInt()
        val b = angka2.text.toString().toInt()

        val hasilnya = a - b

        textViewHasil.text = "Hasil : $hasilnya"
    }

    fun perkalian(view: View){

        val a = angka1.text.toString().toInt()
        val b = angka2.text.toString().toInt()

        val hasilnya = a * b

        textViewHasil.text = "Hasil : $hasilnya"
    }

    fun pembagian(view: View){

        val a = angka1.text.toString().toInt()
        val b = angka2.text.toString().toInt()

        val hasilnya = a / b

        textViewHasil.text = "Hasil : $hasilnya"
    }

}
