package com.example.macro

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.TextView
import java.util.Calendar

class BookingLapangan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_lapangan)

        val selectDateButton: ImageView = findViewById(R.id.calender)
        val includedLayout = findViewById<View>(R.id.include2)
        val pilih = includedLayout.findViewById<Button>(R.id.Btnbooking1)

        pilih.setOnClickListener {
            val intent = Intent(this@BookingLapangan, PilihJam::class.java)
            startActivity(intent)
        }

        selectDateButton.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                    val dateTextView: TextView = findViewById(R.id.dateTextView)
                    val selectedDate = "$dayOfMonth/${monthOfYear + 1}/$year"
                    dateTextView.text = "Tanggal Terpilih: $selectedDate"
                },
                year, month, day
            )
            datePickerDialog.show()
        }
    }
}