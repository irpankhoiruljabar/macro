package com.example.macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Lapangan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapangan)

        val includedLayout = findViewById<View>(R.id.layout_include)

        val button22 = includedLayout.findViewById<Button>(R.id.button22)

        val gambar  = findViewById<ImageView>(R.id.Gambar) // deklarasi

        gambar.setOnClickListener {
            val back = Intent(this@Lapangan, SewaKembali::class.java)
            startActivity(back)
        }

        button22.setOnClickListener {
            val intent = Intent(this@Lapangan, BookingLapangan::class.java)
            startActivity(intent)
        }
        val selengkapnyaTextView = includedLayout.findViewById<TextView>(R.id.selengkapnya)
        selengkapnyaTextView.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Kebijakan Privasi")
            builder.setMessage("1. Penyewa harus membayar DP minimal sebesar 50%.\n2. DP yang sudah masuk tidak dapat dikembalikan.\n3. Penyewa yang terlambat tidak mendapatkan waktu tambahan.\n4. Penyewa yang terlambat lebih dari 15 menit maka lapangan akan diberikan ke penyewa lain.\n5. Pelunasan biaya sewa harus dilakukan sebelum waktu bermain.\n6. Pengguna hanya memakai lapangan sesuai waktu yang disepakati di awal pemesanan.\n7. Kehilangan barang bawaan tidak menjadi tanggung jawab Penyedia lapangan.")
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            val lp = WindowManager.LayoutParams()
            lp.copyFrom(dialog.window?.attributes)
            lp.width = WindowManager.LayoutParams.MATCH_PARENT
            lp.height = WindowManager.LayoutParams.WRAP_CONTENT
            lp.gravity = Gravity.BOTTOM
            dialog.window?.attributes = lp
            dialog.show()
        }
    }
}
