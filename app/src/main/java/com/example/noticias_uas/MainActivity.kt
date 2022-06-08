package com.example.noticias_uas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //webview
        val myWebView: WebView = findViewById(R.id.test)
        myWebView.loadUrl("https://fim.uas.edu.mx/index.php")

    }
}