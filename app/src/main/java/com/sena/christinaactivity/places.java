package com.sena.christinaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class places extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);


        TextView caltxt = findViewById(R.id.calaguastxt);

        caltxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, withloc.class);
                startActivity(intent);
            }
        });

        TextView longbechtxt = findViewById(R.id.longbechtxt);

        longbechtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, longbeach.class);
                startActivity(intent);
            }
        });


        TextView baltxt = findViewById(R.id.balwarttxt);

        baltxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, balwartebeach.class);
                startActivity(intent);
            }
        });

        TextView vinztxt = findViewById(R.id.vinzshead);

        vinztxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, headquarter.class);
                startActivity(intent);
            }
        });

        TextView chrtxt = findViewById(R.id.baltime);

        chrtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, vinzonschurch.class);
                startActivity(intent);
            }
        });

        TextView stattxt = findViewById(R.id.stat);

        stattxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, statue.class);
                startActivity(intent);
            }
        });

        TextView vphstxt = findViewById(R.id.textView15);

        vphstxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, vphs.class);
                startActivity(intent);
            }
        });

        TextView hoptxt = findViewById(R.id.textView17);

        hoptxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, islandhopping.class);
                startActivity(intent);
            }
        });

        TextView scultxt = findViewById(R.id.textView18);

        scultxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, scuba.class);
                startActivity(intent);
            }
        });

        TextView pastxt = findViewById(R.id.textView19);

        pastxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, pasalubong.class);
                startActivity(intent);
            }
        });


        Button backButton = findViewById(R.id.bckbttn);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(places.this, xplorenow.class);
                startActivity(intent);
            }
        });
    }
}
