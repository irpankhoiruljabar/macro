package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Lapangan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapangan)

        // Temukan layout yang di-include
        val includedLayout = findViewById<View>(R.id.layout_include)

        // Temukan tombol di dalam layout yang di-include
        val button22 = includedLayout.findViewById<Button>(R.id.button22)

        // Tambahkan tindakan ketika tombol ditekan
        button22.setOnClickListener {
            // Pindah ke halaman lain di sini
            val intent = Intent(this@Lapangan, Login::class.java) // Ganti HalamanTujuan dengan Activity tujuan yang sesuai
            startActivity(intent)
        }
    }
}
