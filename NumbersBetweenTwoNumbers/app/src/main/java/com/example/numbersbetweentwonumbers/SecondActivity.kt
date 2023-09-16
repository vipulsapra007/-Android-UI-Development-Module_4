package com.example.numbersbetweentwonumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.numbersbetweentwonumbers.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var firstNumber=intent.getIntExtra("FIRST",0)
        var lastNumber=intent.getIntExtra("LAST",0)

      var series=if(firstNumber<=lastNumber){
          (firstNumber..lastNumber).toList()
      }else{
          (lastNumber..firstNumber).toList()
      }

        binding.tvSeries.text="""
            
            Series=$series
            
   
            
        """.trimIndent()
    }
}