package com.example.fragmentnavigatetologinsignupactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentnavigatetologinsignupactivity.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {


    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {

            var email=binding.etEmail.text.toString().trim()
            var password=binding.etPassword.text.toString().trim()

         Toast.makeText(context,"""Email=$email
             |Password=$password
         """.trimMargin(),Toast.LENGTH_SHORT).show()
        }

    }
}