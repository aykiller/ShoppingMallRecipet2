package com.example.shoppingmallrecipet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chk1= findViewById<CheckBox>(R.id.checkbox1)
        val chk2= findViewById<CheckBox>(R.id.checkbox2)
        val chk3= findViewById<CheckBox>(R.id.checkbox3)
        val chk4= findViewById<CheckBox>(R.id.checkbox4)
        val chk5= findViewById<CheckBox>(R.id.checkbox5)
        val gst1= findViewById<CheckBox>(R.id.gst1)
        val gst2= findViewById<CheckBox>(R.id.gst2)
        val btn= findViewById<Button>(R.id.btn)
        val txt= findViewById<TextView>(R.id.recipt)
        chk1.setOnClickListener(this)
        chk2.setOnClickListener(this)
        chk3.setOnClickListener(this)
        chk4.setOnClickListener(this)
        chk5.setOnClickListener(this)
        gst1.setOnClickListener(this)
        gst2.setOnClickListener(this)


        btn.setOnClickListener {
            var s:String=""
            if(chk1.isChecked){
                s+= chk1.text.toString()
            }
            if (chk2.isChecked)  {
                s += chk2.text.toString()
            }
            if (chk3.isChecked)  {
                s += chk3.text.toString()
            }
            if (chk4.isChecked)  {
                s += chk4.text.toString()
            }
            if (chk5.isChecked)  {
                s += chk5.text.toString()
            }


        }


        }

    override fun onClick(v: View?) {
        val id=v?.id
        when(id){
            R.id.gst1 -> {
            gst2.isChecked = false
        }
            R.id.gst2 ->{
            gst1.isChecked = false

            }
        }
    }
}


