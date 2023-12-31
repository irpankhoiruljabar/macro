package com.example.macro

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val logout = view.findViewById<Button>(R.id.logoutButton)

        logout.setOnClickListener {
            val keluar = Intent(activity, Login::class.java)
            startActivity(keluar)
        }

        // Temukan elemen stng_akun
        val stngAkun = view.findViewById<LinearLayout>(R.id.stng_akun)
        // Tambahkan klik listener untuk perpindahan halaman Akun Seting
        stngAkun.setOnClickListener {
            val intent = Intent(requireContext(), akun_seting::class.java)
            startActivity(intent)
        }

        // Temukan elemen stg_info
        val stgInfo = view.findViewById<LinearLayout>(R.id.stg_info)
        // Tambahkan klik listener untuk perpindahan halaman Bantuan
        stgInfo.setOnClickListener {
            val intent = Intent(requireContext(), Bantuan::class.java)
            startActivity(intent)
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProfileFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProfileFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}