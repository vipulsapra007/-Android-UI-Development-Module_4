package com.example.fragmentnavigatetologinsignupactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentnavigatetologinsignupactivity.databinding.FragmentSignupBinding


class SignupFragment : Fragment() {

    lateinit var binding: FragmentSignupBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignupBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnConfrim.setOnClickListener {

            var fName = binding.etFname.text.toString().trim()
            var lName = binding.etLname.text.toString().trim()
            var bDate = binding.etBirthdate.text.toString().trim()
            var password = binding.etPassword.text.toString().trim()

            Toast.makeText(
                context, """First Name=$fName
                |Last Name =$lName
                |Birth Date=$bDate
                |Password  =$password
            """.trimMargin(), Toast.LENGTH_LONG
            ).show()
        }
    }


}