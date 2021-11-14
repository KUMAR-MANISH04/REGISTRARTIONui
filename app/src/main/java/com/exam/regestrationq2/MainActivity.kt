package com.example.ca_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.exam.regestrationq2.R

class Manish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rb1=findViewById<RadioButton>(R.id.radioButton)
        val rb2=findViewById<RadioButton>(R.id.radioButton2)
        val et1=findViewById<EditText>(R.id.editTextNumberSigned)
        val et=findViewById<EditText>(R.id.editTextTextPersonName)
        val btnSub=findViewById<Button>(R.id.button)
        val cb=findViewById<CheckBox>(R.id.checkBox)
        val cb1=findViewById<CheckBox>(R.id.checkBox1)
        val cb2=findViewById<CheckBox>(R.id.checkBox2)
        val cb3=findViewById<CheckBox>(R.id.checkBox3)
        btnSub.setOnClickListener {
            if(cb.isChecked)
            {
                cb.isChecked = false
            }
            if(cb1.isChecked)
            {
                cb1.isChecked = false
            }
            if(cb2.isChecked)
            {
                cb2.isChecked = false
            }
            if(cb3.isChecked)
            {
                cb3.isChecked = false
            }
            if(rb1.isChecked)
            {
                rb1.isChecked=false
            }
            if(rb2.isChecked)
            {
                rb2.isChecked=false
            }
            Toast.makeText(applicationContext, "Thank You "+et.text+" Of age "+et1.text, Toast.LENGTH_SHORT).show()
            et.text.clear()
            et1.text.clear()
        }

        cb.setOnClickListener {
            Toast.makeText(applicationContext,cb.text,Toast.LENGTH_SHORT).show()
        }
        cb1.setOnClickListener {
            Toast.makeText(applicationContext,cb1.text,Toast.LENGTH_SHORT).show()
        }
        cb2.setOnClickListener {
            Toast.makeText(applicationContext,cb1.text,Toast.LENGTH_SHORT).show()
        }
        cb3.setOnClickListener {
            Toast.makeText(applicationContext,cb1.text,Toast.LENGTH_SHORT).show()
        }

        rb1.setOnClickListener{
            Toast.makeText(applicationContext, rb1.text, Toast.LENGTH_SHORT).show()
        }
        rb2.setOnClickListener{
            Toast.makeText(applicationContext, rb2.text, Toast.LENGTH_SHORT).show()
        }
    }
}