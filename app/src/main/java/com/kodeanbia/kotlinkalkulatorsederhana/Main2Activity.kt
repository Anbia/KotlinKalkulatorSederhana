package com.kodeanbia.kotlinkalkulatorsederhana

import android.content.DialogInterface
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    var number:Int = 0
    var handler:Handler = Handler()
    var runnable: Runnable = Runnable {  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        object : CountDownTimer(10000,1000){
            override fun onFinish() {
                Toast.makeText(applicationContext, "Time's is Off",Toast.LENGTH_LONG).show()
                textView.text = "left : 0"
            }

            override fun onTick(p0: Long) {
                textView.text = "left : " + p0 / 1000
            }

        }.start()
    }

    fun start(view:View){
        number = 0
        runnable = object : Runnable{
            override fun run() {
                textViewRunnable.text = "Time :" + number
                number++
                textViewRunnable.text = "Time : " + number
                handler.postDelayed(this,1000)
            }

        }
        handler.post(runnable)
        Toast.makeText(applicationContext, "Start",Toast.LENGTH_LONG).show()
    }

    fun reset(view: View){

        val alert = AlertDialog.Builder(this)

        alert.setTitle("Reset")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("yes"){
            dialog: DialogInterface?, which: Int ->

            handler.removeCallbacks(runnable)
            number = 0

            textViewRunnable.text = "Time : " + number
            Toast.makeText(applicationContext, "Reset",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No"){
            dialog: DialogInterface?, which: Int ->
            Toast.makeText(applicationContext, "Not Reset",Toast.LENGTH_LONG).show()
        }
        alert.show()


    }

}
