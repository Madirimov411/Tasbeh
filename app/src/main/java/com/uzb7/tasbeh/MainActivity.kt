package com.uzb7.tasbeh

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var asosiydispley: TextView
    lateinit var qoshish11: TextView
    lateinit var qoshish22: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        qoshish()
    }

    @SuppressLint("ServiceCast")
    private fun qoshish() {
        qoshish11 = findViewById(R.id.tv_qoshish)
        qoshish22 = findViewById(R.id.tv_qoshish1)
        asosiydispley = findViewById(R.id.tv_asosiyqoshish)
        val bosish = findViewById<ImageView>(R.id.iv_bosish)
        val tozalash = findViewById<ImageView>(R.id.iv_refresh)
        tozalash.setOnClickListener {
            qoshish11.text = "0"
            qoshish22.text = "0"
            asosiydispley.text = "0"
        }
        bosish.setOnClickListener {
            if (qoshish22.text == "99") {
                qoshish11.text = "0"
                qoshish22.text = "0"
                val y = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                y.vibrate(700)
            } else if (qoshish22.text == "33" || qoshish22.text == "66") {
                val y = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                y.vibrate(500)
            } else {
                val y = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                y.vibrate(80)
            }
            qoshish11.text = (qoshish11.text.toString().toInt() + 1).toString()
            qoshish22.text = (qoshish22.text.toString().toInt() + 1).toString()
            asosiydispley.text = (asosiydispley.text.toString().toInt() + 1).toString()
        }
    }
}