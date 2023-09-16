package com.example.toolbarwithspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.toolbarwithspinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var language= arrayListOf("Select language","PHP","C++","PYTHON","C","JAVA","KOTLIN","DART","JAVASCRIPT","FLUTTER","SWIFT","NODE","REACT")
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,language)
        binding.spinner.adapter=adapter
    }
}