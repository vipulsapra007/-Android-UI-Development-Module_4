package com.example.hidetextwithcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hidetextwithcheckbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chkbox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                // show
                binding.textView.visibility=View.VISIBLE

            }else{
                // hide
                binding.textView.visibility=View.GONE
            }
        }
    }
}