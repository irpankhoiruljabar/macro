package com.example.macro

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HistoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HistoryFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var promoTitle4: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_history, container, false)
        val includedLayout = view.findViewById<View>(R.id.sewa)
        val quadranLayout = includedLayout.findViewById<LinearLayout>(R.id.quadran)
        val promoCardView2 = view.findViewById<View>(R.id.promoCardView2)
        val includedLayout2 = view.findViewById<View>(R.id.riwayat22)
        promoTitle4 = includedLayout2.findViewById<TextView>(R.id.promoTitle4)
        promoCardView2.setOnClickListener {
            showActivityPopup()
        }

        quadranLayout.setOnClickListener {

            val intent = Intent(requireContext(), Lapangan::class.java)
            startActivity(intent)

        }

        return view
    }

    private fun showActivityPopup() {
        val activityDetails = "Aktifitas Anda Akan berlangsung\npada 28 September 2023\nJam 15.00 - 16.00"

        AlertDialog.Builder(requireContext())
            .setMessage(activityDetails)
            .setPositiveButton("Batalkan") { _, _ ->
                showCancelConfirmationPopup()
            }
            .setNegativeButton("Tutup") { _, _ ->
            }
            .show()
    }

    private fun showCancelConfirmationPopup() {
        AlertDialog.Builder(requireContext())
            .setMessage("Apakah anda yakin ingin membatalkan Pesanan?")
            .setPositiveButton("Iya") { _, _ ->
                showCancelSuccessPopup()

            }
            .setNegativeButton("Tidak") { _, _ ->

            }
            .show()
    }

    private fun showCancelSuccessPopup() {
        AlertDialog.Builder(requireContext())
            .setMessage("Pesanan Berhasil Dibatalkan!")
            .setPositiveButton("Tutup") { _, _ ->
                promoTitle4.text = "Dibatalkan" // Implement any actions you want when the success pop-up is closed
                promoTitle4.setTextColor(ContextCompat.getColor(requireContext(), R.color.red))
            }
            .show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HistoryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HistoryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}