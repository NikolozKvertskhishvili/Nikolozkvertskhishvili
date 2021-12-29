package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login_activity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var login: Button
    lateinit var armaqvs: TextView
    var em: String = "admin"
    var pas: String = "admin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        login = findViewById(R.id.login)
        armaqvs = findViewById(R.id.armaqvs)

        login.setOnClickListener{
            if(em == email.getText().toString() && pas == password.getText().toString()){
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Email Or Password Is Incorrect", Toast.LENGTH_SHORT).show()
            }
        }
        email.setText(intent?.extras?.getString("usermail","none"))
        password.setText(intent?.extras?.getString("userpass","none"))
        armaqvs.setOnClickListener{
            val intent = Intent(this, Registration::class.java)
            intent.putExtra("userpass", password.getText().toString())
            intent.putExtra("usermail", email.getText().toString())
            startActivity(intent)
        }

    }
}

