package com.hobee.hobeemobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }

    fun checkPassword (view: View){
        val username = findViewById<TextInputEditText>(R.id.username)
        val password = findViewById<TextInputEditText>(R.id.password)

        if (username.text.toString() == "biji" && password.text.toString() == "rahasia"){
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_LONG).show()
        } else Toast.makeText(this, "Login Gagal", Toast.LENGTH_LONG).show()
    }
}