package com.example.changedisplaycoloronradiobuttonclick

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.changedisplaycoloronradiobuttonclick.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    @SuppressLint("ResourceAsColor")
    fun onRadioButtonClicked(view: View) {
        when (view.id){
            R.id.rb_amber->binding.layout.setBackgroundResource(R.color.amber)
            R.id.rb_grey->binding.layout.setBackgroundResource(R.color.grey)
            R.id.rb_purple->binding.layout.setBackgroundResource(R.color.purple)
            R.id.rb_green->binding.layout.setBackgroundResource(R.color.green)
            R.id.rb_blue->binding.layout.setBackgroundResource(R.color.blue)
            R.id.rb_yellow->binding.layout.setBackgroundResource(R.color.yellow)
            R.id.rb_pink->binding.layout.setBackgroundResource(R.color.pink)
        }
    }
}