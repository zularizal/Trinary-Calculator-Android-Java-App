package com.trinarycalculator.ayidouble.trinarycalculator;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends WearableActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.BinaryCalculatorWebView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://ayidouble.github.io/Trinary-Calculator-JavaScript/");

        // Enables Always-on
        setAmbientEnabled();
    }
}
