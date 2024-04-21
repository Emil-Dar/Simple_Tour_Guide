package com.sena.christinaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class vinzonschurch extends AppCompatActivity {

    Button locationbtn;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinzonschurch);

        locationbtn = findViewById(R.id.balloc);

        String location = getString(R.string.vinzonschurch_location_url);

        locationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location)));
            }
        });

        Button backButton = findViewById(R.id.bcklong);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vinzonschurch.this, places.class);
                startActivity(intent);
            }
        });
    }
}
