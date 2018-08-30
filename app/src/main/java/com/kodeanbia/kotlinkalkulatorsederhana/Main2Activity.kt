package com.kodeanbia.kotlinkalkulatorsederhana

import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

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
}
