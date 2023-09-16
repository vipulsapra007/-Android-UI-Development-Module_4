package com.example.fragmentnavigatetologinsignupactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.fragmentnavigatetologinsignupactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            var manager=supportFragmentManager
            var fragment=LoginFragment()

            var transaction=manager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }

        binding.btnSignup.setOnClickListener {
            var manager=supportFragmentManager
            var fragment=SignupFragment()
            var transaction=manager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }




    }
}