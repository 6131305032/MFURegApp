package com.example.gruit.mfureg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

//make your class implement OnClickListener
public class ScrollingActivity extends AppCompatActivity implements OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        //Create your buttons and set their onClickListener to "this"

        LinearLayout bTimetable = (LinearLayout) findViewById(R.id.bTimetable);
        bTimetable.setOnClickListener(this);

        LinearLayout bBio = (LinearLayout) findViewById(R.id.bBio);
        bBio.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(ScrollingActivity.this, Webview.class);
        switch(v.getId())
        {
            case R.id.bTimetable:
                intent.putExtra("url", "https://www.google.com");
                startActivity(intent);
                break;

            case R.id.bBio:
                intent.putExtra("url", "https://www.google.com");
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
