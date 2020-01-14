package com.mobcomp.lab

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt : Button = findViewById (R.id.button_change_color)
        var color_flag : Boolean = false

        bt.setOnClickListener {
            if ( !color_flag ) {
                bt.setTextColor(resources.getColor(R.color.winered))
                color_flag=true
            } else {
                bt.setTextColor(resources.getColor(R.color.darkgrey))
                color_flag=false
            }

        }

    }



}
