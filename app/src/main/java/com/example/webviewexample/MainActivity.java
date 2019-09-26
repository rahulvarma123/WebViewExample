package com.example.webviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.MimeTypeMap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Base64;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
       /* String data = "<html><body><h1>Happy Sunday</h1><h2>Good Morning</h2></body></html>";
        webView.loadData(data, "text/html", "UTF-8");*/
        webView.getSettings().setJavaScriptEnabled(true);

        //webView.loadUrl("file:///android_asset/greet.html");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.google.com");
    }
}
