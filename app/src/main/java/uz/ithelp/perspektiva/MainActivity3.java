package uz.ithelp.perspektiva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity3 extends AppCompatActivity {

    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        webView1 = findViewById(R.id.webView1);


        webView1.setWebViewClient(new WebViewClient());
        webView1.getSettings().setSupportZoom(true);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl( "https://docs.google.com/gview?embedded=true&url=" + getIntent().getStringExtra("data"));



//
//        Intent intent  = getIntent();
//        if (intent.getExtras() != null) {
//            webView1.loadUrl(intent.getStringExtra("data"));
//        }

    }
}