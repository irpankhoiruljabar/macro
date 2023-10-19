package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PesananBerhasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesanan_berhasil)
        val includedLayout = findViewById<View>(R.id.adi)

        val button2 = includedLayout.findViewById<Button>(R.id.BtnYes)

        button2.setOnClickListener {
            val intent = Intent(this@PesananBerhasil, MainActivity::class.java)
            startActivity(intent)
        }
    }
}