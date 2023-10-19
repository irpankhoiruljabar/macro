package com.example.macro

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class PilihJam : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_jam)

        var Klik = findViewById<ImageButton>(R.id.Pensil)
        var Klik2 = findViewById<ImageButton>(R.id.BtnJam)
        var pesan = findViewById<Button>(R.id.BtnPesan22)
        pesan.setOnClickListener(this)

        Klik.setOnClickListener {
            showPemesanPopup()
        }

        Klik2.setOnClickListener {
            showJamPopup()
        }
    }
    fun showPemesanPopup() {
        val inflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.popup_pemesan, null)

        val builder = AlertDialog.Builder(this)
            builder.setView(dialogView)

        val simpanButton = dialogView.findViewById<Button>(R.id.BtnSimpan)
        simpanButton.setOnClickListener {
            builder.create().dismiss()
        }
        val alert = builder.create()

        simpanButton.setOnClickListener {
            alert.dismiss() // Tutup AlertDialog saat tombol "Simpan" ditekan
        }
        alert.show()

    }
    fun showJamPopup() {
        val inflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.popup_jam, null)

        val builder = AlertDialog.Builder(this)
        builder.setView(dialogView)

        val simpanButton = dialogView.findViewById<Button>(R.id.BtnSVJam)
        simpanButton.setOnClickListener {
            builder.create().dismiss()
        }
        val alert = builder.create()

        simpanButton.setOnClickListener {
            alert.dismiss() // Tutup AlertDialog saat tombol "Simpan" ditekan
        }
        alert.show()

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.BtnPesan22 ->{
                var Masuk = Intent(this@PilihJam, Pembayaran::class.java)
                startActivity(Masuk)
            }
        }
    }
}