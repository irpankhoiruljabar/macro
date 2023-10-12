package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Daftar : AppCompatActivity(), View.OnClickListener {

    private lateinit var etNama: EditText
    private lateinit var etNomor: EditText
    private lateinit var etEmail: EditText
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        etNama = findViewById(R.id.InputNama)
        etNomor =findViewById(R.id.InputNomor)
        etEmail = findViewById(R.id.InputEmail)
        etUsername = findViewById(R.id.InputUsername)
        etPassword = findViewById(R.id.InputPassword)

        val Klik : Button = findViewById(R.id.BtnSimpan)
        Klik.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.BtnSimpan -> {
                val kurir = Bundle()
                kurir.putString("Username", etUsername.text.toString())
                kurir.putString("Password", etPassword.text.toString())

                var Pencet = Intent(this@Daftar, Login::class.java)
                intent.putExtras(kurir)
                startActivity(Pencet)
            }
        }
    }

}