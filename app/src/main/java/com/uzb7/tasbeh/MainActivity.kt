package com.uzb7.tasbeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var asosiydispley:TextView
    lateinit var qoshish11:TextView
    lateinit var qoshish22:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        qoshish()
    }

    private fun qoshish() {
        qoshish11=findViewById(R.id.tv_qoshish)
        qoshish22=findViewById(R.id.tv_qoshish1)
        asosiydispley= findViewById(R.id.tv_asosiyqoshish)
        val bosish=findViewById<ImageView>(R.id.iv_bosish)
        val tozalash=findViewById<ImageView>(R.id.iv_refresh)
        tozalash.setOnClickListener {
            qoshish11.text="0"
            qoshish22.text="0"
            asosiydispley.text="0"
        }
        bosish.setOnClickListener {
            if(qoshish22.text=="99"){
                qoshish11.text="0"
                qoshish22.text="0"
            }
            qoshish11.text=(qoshish11.text.toString().toInt()+1).toString()
            qoshish22.text=(qoshish22.text.toString().toInt()+1).toString()
            asosiydispley.text=(asosiydispley.text.toString().toInt()+1).toString()

        }
    }
}