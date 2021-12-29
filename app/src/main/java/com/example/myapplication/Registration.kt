package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Registration : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var alreadyhaveanaccount: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        alreadyhaveanaccount = findViewById(R.id.already)

        alreadyhaveanaccount.setOnClickListener{
            val intent = Intent(this, Login_activity::class.java)
            intent.putExtra("userpass", password.getText().toString())
            intent.putExtra("usermail", email.getText().toString())
            startActivity(intent)
        }
        email.setText(intent?.extras?.getString("usermail","none"))
        password.setText(intent?.extras?.getString("userpass","none"))
    }
}