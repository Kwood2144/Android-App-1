 package com.example.viewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et : EditText= findViewById(R.id.editText1)
        // getting input from text field
        //et.text
        val but : Button= findViewById(R.id.button)

        but.setOnClickListener {
                Toast.makeText(this@MainActivity, "hello" + et.text, Toast.LENGTH_LONG).show()

        }
    }

}