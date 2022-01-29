package com.example.akshatappd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name =findViewById<EditText>(R.id.name)
        val age =findViewById<EditText>(R.id.age)
        val btn =findViewById<Button>(R.id.submit_btn)
        btn.setOnClickListener(View.OnClickListener {
            if (name.text.toString().trim().isEmpty()){
                Toast.makeText(this, "Enter your name!", Toast.LENGTH_SHORT).show()
            }
            else if (age.text.toString().trim().isEmpty()){
                Toast.makeText(this, "Enter your age!", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Hey! ${name.text.toString()} , Go Corona Go ", Toast.LENGTH_LONG).show()
            }
        })



    }
}