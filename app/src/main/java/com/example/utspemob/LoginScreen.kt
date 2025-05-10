package com.example.utspemob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginScreen : AppCompatActivity(){
    private lateinit var etUSername:EditText
    private lateinit var etPassword:EditText
    private var registeredUser:String?=null
    private var registeredPass:String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUSername=findViewById(R.id.etUsername)
        etPassword=findViewById(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnToRegister = findViewById<Button>(R.id.btnToRegister)

        registeredUser = intent.getStringExtra("username")
        registeredPass = intent.getStringExtra("password")

        btnLogin.setOnClickListener {
            val user = etUSername.text.toString()
            val pass = etPassword.text.toString()

            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Isi dulu semuanya", Toast.LENGTH_SHORT).show()
            } else if (user == registeredUser && pass == registeredPass ){
                startActivity(Intent(this, LibraryScreen::class.java))
                finish()
            }else{
                Toast.makeText(this,"Login gagal, Cobain lagi.", Toast.LENGTH_SHORT).show()
            }
        }

        btnToRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}