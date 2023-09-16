package com.example.stringarraayinxml

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.stringarraayinxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mAdapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var array = resources.getStringArray(R.array.Languages)

        mAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,array)
        binding.listView.adapter=mAdapter


        binding.listView.setOnItemClickListener { parent, view, position, id ->


            var language=array[position]
            Toast.makeText(this, "$language", Toast.LENGTH_SHORT).show()

        }
    }
}