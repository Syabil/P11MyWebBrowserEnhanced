package com.example.a16019990.mywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etUrl;
    WebView wvWebPage;
    Button btnLoadURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvWebPage = findViewById(R.id.webview);
        btnLoadURL = findViewById(R.id.button);
        etUrl = findViewById(R.id.editTextURL);

        wvWebPage.getSettings().setJavaScriptEnabled(true);
        wvWebPage.getSettings().setBuiltInZoomControls(true);
        wvWebPage.getSettings().setAllowFileAccess(false);
        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etUrl.getText().toString();
                if (!url.equals("")) {
                    wvWebPage.loadUrl(url);
                }
            }
        });
    }
}
