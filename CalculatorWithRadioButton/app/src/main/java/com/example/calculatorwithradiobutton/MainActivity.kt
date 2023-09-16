package com.example.calculatorwithradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.calculatorwithradiobutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var answer = 0.0
    private var Num1 = 0.0
    private var Num2 = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfirm.setOnClickListener {
            Num1 = binding.etNum1.text.toString().trim().toDouble()
            Num2 = binding.etNum2.text.toString().trim().toDouble()

            when (binding.rgButton.checkedRadioButtonId) {

                R.id.rb_sum -> answer = Num1 + Num2
                R.id.rb_substraction -> answer = Num1 - Num2
                R.id.rb_multiplication -> answer = Num1 * Num2
                R.id.rb_division -> answer = Num1 / Num2
            }
            binding.tvAnswer.text= "$answer"

        }
        binding.btnReset.setOnClickListener {
                binding.etNum1.text.clear()
                binding.etNum2.text.clear()
                binding.tvAnswer.text=""


        }
    }
}