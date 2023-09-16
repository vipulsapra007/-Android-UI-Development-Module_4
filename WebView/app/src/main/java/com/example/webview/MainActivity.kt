package com.example.webview

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.example.webview.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        weViewSetup()


    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun weViewSetup() {
        binding.webViewContainer.webViewClient = WebViewClient()

        binding.webViewContainer.apply {
            loadUrl("https://www.google.com/")
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true

        }

        binding.btnBack.setOnClickListener {
            if (binding.webViewContainer.canGoBack()) {
                binding.webViewContainer.goBack()
            } else {
                val snack = Snackbar.make(it, "You Cant Go BackWard", Snackbar.LENGTH_SHORT)
                snack.show()
            }
        }
        binding.btnForward.setOnClickListener {
            if (binding.webViewContainer.canGoForward()) {
                binding.webViewContainer.goForward()
            } else {
                val snack = Snackbar.make(it, "You Cant Go ForWard", Snackbar.LENGTH_SHORT)
                snack.show()
            }
        }
    }

    override fun onBackPressed() {
        if (binding.webViewContainer.canGoBack()) {
            binding.webViewContainer.goBack()
        } else
            super.onBackPressed()
    }


}


