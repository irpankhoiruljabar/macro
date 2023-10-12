package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Login : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var Klik: Button = findViewById(R.id.BtnDaftar)
        Klik.setOnClickListener(this)
        var Klikm: Button = findViewById(R.id.BtnMasuk)
        var Klik2:Button = findViewById(R.id.BtnLupaPW)
        Klik2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.BtnDaftar -> {
                var Pencet = Intent(this@Login, Daftar::class.java)
                startActivity(Pencet)
            }
            R.id.BtnDaftar -> {
                var Pencet2 = Intent(this@Login, Daftar::class.java)
                startActivity(Pencet2)
            }

            R.id.BtnMasuk -> {
                var Pencet3 = Intent(this@Login, MainActivity::class.java)
                startActivity(Pencet3)
            }
        }
    }


}