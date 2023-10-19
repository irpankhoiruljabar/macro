package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername : EditText
    private lateinit var etPassword : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.InputUser)
        etPassword = findViewById(R.id.InputPass)

        val kurir = intent.extras
        if (kurir != null) {
            etUsername.setText(kurir.getString("Username"))
            etPassword.setText(kurir.getString("Password"))
        }

        var Klik: Button = findViewById(R.id.BtnDaftar)
        Klik.setOnClickListener(this)
        var Klikm: Button = findViewById(R.id.BtnMasuk)
        Klikm.setOnClickListener(this)
        var Klik2:Button = findViewById(R.id.BtnLupaPW)
        Klik2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.BtnDaftar -> {
                var Pencet = Intent(this@Login, Daftar::class.java)
                startActivity(Pencet)
            }

            R.id.BtnLupaPW -> {
                var Pencet2 = Intent(this@Login, LupaPW::class.java)
                startActivity(Pencet2)
            }

            R.id.BtnMasuk -> {
                var Pencet3 = Intent(this@Login, MainActivity::class.java)
                startActivity(Pencet3)
            }
        }
    }
}