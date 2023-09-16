package com.example.textviewhideonbuttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.textviewhideonbuttonclick.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHide.setOnClickListener {
            binding.tvText.visibility=View.GONE
        }
        binding.btnView.setOnClickListener {
            binding.tvText.visibility=View.VISIBLE
        }
    }
}