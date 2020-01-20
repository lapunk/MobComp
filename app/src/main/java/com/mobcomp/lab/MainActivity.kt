package com.mobcomp.lab

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt : Button = findViewById (R.id.button_change_color)
        var colorFlag = false
        // I have no idea what i am doing
        val context : Context = applicationContext

        bt.setOnClickListener {
            if ( !colorFlag ) {
                bt.setTextColor(ContextCompat.getColor(context, R.color.winered))
                colorFlag=true
            } else {
                bt.setTextColor(ContextCompat.getColor(context, R.color.darkgrey))
                colorFlag=false
            }

        }

    }



}
