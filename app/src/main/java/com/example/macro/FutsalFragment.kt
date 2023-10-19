package com.example.macro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [FutsalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FutsalFragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_futsal, container, false)
        val gambar = view.findViewById<ImageView>(R.id.Gambar)
        val harga :Button = view.findViewById(R.id.bt_harga)
        val topbooked :Button = view.findViewById(R.id.bt_TopBooked)

        gambar.setOnClickListener {
            val fragmentTujuan = HomeFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragmentTujuan)
                .commit()
        }
        harga.setOnClickListener {
            val fragment2 = FutsalFragment2()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment_container, fragment2)
            transaction?.commit()
        }
        topbooked.setOnClickListener {
            val fragment3 = FutsalFragment3()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragment_container, fragment3)
            transaction?.commit()
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
         * @return A new instance of fragment FutsalFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FutsalFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

private fun Button.setOnClickListener(onClickListener: Unit) {

}
