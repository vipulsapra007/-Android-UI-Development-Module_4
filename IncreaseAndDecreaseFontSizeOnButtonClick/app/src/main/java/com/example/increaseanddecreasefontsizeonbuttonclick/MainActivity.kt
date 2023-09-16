package com.example.increaseanddecreasefontsizeonbuttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import com.example.increaseanddecreasefontsizeonbuttonclick.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    var fontSize: Float = 28f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnIcrease.setOnClickListener {

            fontSize += 4

            binding.tvText.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)

        }
        binding.btnDecrease.setOnClickListener {


            fontSize -= 4


            binding.tvText.setTextSize(TypedValue.COMPLEX_UNIT_SP, fontSize)

        }

    }
}