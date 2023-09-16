package com.example.dynamicallycreateedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.dynamicallycreateedittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            var number = binding.etNum.text.toString().trim().toInt()

            for (i in 0 until number) {
                val editText = EditText(this)
                editText.hint = "Edit Text ${i+1}"
                binding.layout.addView(editText)

            }


        }


    }
}