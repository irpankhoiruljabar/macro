package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Pembayaran : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        var Klik:Button = findViewById(R.id.BtnPesan)
        Klik.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.BtnPesan ->{
                var Masuk = Intent(this@Pembayaran,PesananBerhasil::class.java)
                startActivity(Masuk)
            }
        }
    }
}