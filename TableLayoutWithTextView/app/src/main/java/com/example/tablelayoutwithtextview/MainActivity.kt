package com.example.tablelayoutwithtextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablelayoutwithtextview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var Roll = intent.getIntExtra("ROLL", 0)
        var name = intent.getStringExtra("NAME")
        var city = intent.getStringExtra("CITY")
        var contact = intent.getStringExtra("CONTACT")
        var email = intent.getStringExtra("EMAIL")
        var course=intent.getStringExtra("COURSE")


        binding.tvName.text="Name:$name"
        binding.tvRoll.text="Roll:$Roll"
        binding.tvEmail.text="Email:$email"
        binding.tvCity.text="City:$city"
        binding.tvCourse.text="Course:$course"
        binding.tvContact.text="Contact:$contact"


    }
}