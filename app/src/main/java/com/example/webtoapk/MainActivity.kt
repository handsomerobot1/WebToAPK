package com.example.webtoapk

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webView)
        val url = intent.getStringExtra("URL") ?: "https://default.com"

        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}
