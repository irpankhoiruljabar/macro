package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LandingPage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        var mulai: Button = findViewById(R.id.Btnmulai)
        mulai.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.Btnmulai -> {
                var intent = Intent(this@LandingPage, Login::class.java)
                startActivity(intent)
            }
        }
    }
}