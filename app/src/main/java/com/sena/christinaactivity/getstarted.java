package com.sena.christinaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class getstarted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);

        Button buttonstarted = findViewById(R.id.nextbtn);

        buttonstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the new activity
                Intent intent = new Intent(getstarted.this, xplorenow.class);
                startActivity(intent);
            }
        });

        Button buttonback = findViewById(R.id.backbtn);

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getstarted.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}