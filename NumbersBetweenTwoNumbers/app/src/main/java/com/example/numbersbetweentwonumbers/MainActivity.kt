package com.example.numbersbetweentwonumbers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.numbersbetweentwonumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfrim.setOnClickListener {

            var firstNumber=binding.etFirstNumber.text.toString().trim().toInt()
            var lastNumber=binding.etEndingNumber.text.toString().trim().toInt()

            var intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("FIRST",firstNumber)
            intent.putExtra("LAST",lastNumber)

            startActivity(intent)


        }


    }
}