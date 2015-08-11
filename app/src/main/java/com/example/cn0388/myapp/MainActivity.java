package com.example.cn0388.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    Button Bt4test;
    Button Bt4Image;
    Button Bt4Draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bt4test = (Button)findViewById(R.id.button);
        Bt4test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Toast demo1", Toast.LENGTH_SHORT).show();


                Intent objIntent = new Intent(getApplicationContext(), testdraw.class);
                startActivity(objIntent);
            }
        });

        Bt4Image = (Button)findViewById(R.id.button2);
        Bt4Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent = new Intent(getApplicationContext(), Imgeview.class);
                startActivity(objIntent);
            }
        });

        Bt4Draw = (Button)findViewById(R.id.button4);
        Bt4Draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent = new Intent(getApplicationContext(), testdraw.class);
                startActivity(objIntent);
            }
        });
    }
}

