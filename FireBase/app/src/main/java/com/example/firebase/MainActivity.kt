package com.example.firebase


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_signin:Button = findViewById(R.id.button_signin)

        button_signin.setOnClickListener {
            val Intent = Intent(this, Welcome_Kotlin::class.java)
            startActivity(Intent)
        }

    }
}