package com.example.gruit.mfureg;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ScrollingActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        findViewById(R.id.bTimetable).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ScrollingActivity.this, Webview.class);


                switch(v.getId())
                {
                    case R.id.bTimetable:
                        intent.putExtra("url", "https://docs.google.com/spreadsheets/d/1bKWpQPVEZs3t33dbksIhZ0d81g_RtHV4IVixLhmIXJk/");
                        startActivity(intent);
                        break;

                    default:
                        break;
                }

            }

        });

        findViewById(R.id.bBio).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(ScrollingActivity.this, Webview.class);


                switch(v.getId())
                {
                    case R.id.bBio:
                        intent.putExtra("url", "http://wws.princeton.edu/");
                        startActivity(intent);
                        break;

                    default:
                        break;
                }

            }

        });
    }
}
