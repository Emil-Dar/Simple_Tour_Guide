// MainActivity.java
package com.sena.christinaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getstartedbutton = findViewById(R.id.button2);


        getstartedbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the SecondActivity
                Intent intent = new Intent(MainActivity.this, getstarted.class);

                // Start the activity
                startActivity(intent);
            }
        });



    }

    // Method to exit the program
    private void exitProgram() {
        finish();

    }
}
