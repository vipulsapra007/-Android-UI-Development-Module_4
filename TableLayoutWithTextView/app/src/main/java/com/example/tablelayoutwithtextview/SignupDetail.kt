package com.example.tablelayoutwithtextview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablelayoutwithtextview.databinding.ActivitySignupDetailBinding

class SignupDetail : AppCompatActivity() {
    lateinit var binding: ActivitySignupDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

   binding.btnSubmit.setOnClickListener {
//       var Roll :Int= (0..100).shuffled().last().toInt()

       var Roll:Int=1
       var name = binding.etName.text.toString().trim()
       var email = binding.etEmail.text.toString().trim()
       var contact = binding.etContact.text.toString().trim()
       var city = binding.etCity.text.toString().trim()
       var course = binding.etCourse.text.toString().trim()

       var intent=Intent(this,MainActivity::class.java)
       intent.putExtra("ROLL",Roll)
       intent.putExtra("NAME",name)
       intent.putExtra("EMAIL",email)
       intent.putExtra("CONTACT",contact)
       intent.putExtra("CITY",city)
       intent.putExtra("COURSE",course)
       startActivity(intent)
   }


    }

}