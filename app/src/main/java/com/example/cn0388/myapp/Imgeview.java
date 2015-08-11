package com.example.cn0388.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class Imgeview extends Activity {
    private  ImageView  myImageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imgeview);

        myImageview = (ImageView)findViewById(R.id.imageView);
        //myImageview.setBackgroundColor(android.R.color.black);
        myImageview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "show my image", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
