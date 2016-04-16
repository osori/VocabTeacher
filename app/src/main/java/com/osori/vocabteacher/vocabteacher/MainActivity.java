package com.osori.vocabteacher.vocabteacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.loadUrl("https://duckduckgo.com/?q=sloth&iax=1&ia=images");
        //webview.loadUrl("http://www.google.com");


        TextView txtWord = (TextView) findViewById(R.id.txtWord);
        txtWord.setText("sloth");

    }
}
