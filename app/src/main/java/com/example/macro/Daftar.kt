package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Daftar : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        var Klik : Button = findViewById(R.id.BtnSimpan)
        Klik.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.BtnSimpan -> {
                var Pencet = Intent(this@Daftar, Login::class.java)
                startActivity(Pencet)
            }
        }
    }

}