package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class LupaPW : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_pw)
        var Klik: Button = findViewById(R.id.Simpan)
        Klik.setOnClickListener(this)
        var Klik2: ImageView = findViewById(R.id.Gambar)
        Klik2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.Simpan -> {
                var Pencet1 = Intent(this@LupaPW, Login::class.java)
                startActivity(Pencet1)
            }
            R.id.Gambar -> {
                var Pemcet2 = Intent(this@LupaPW, Login::class.java)
                startActivity(Pemcet2)

            }            }
    }
}