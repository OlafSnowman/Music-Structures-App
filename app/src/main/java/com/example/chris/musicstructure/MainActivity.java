package com.example.chris.musicstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView pop = (TextView) findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView country = (TextView) findViewById(R.id.country);

        // Set a click listener on that View
        country.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, CountryActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView jazz = (TextView) findViewById(R.id.jazz);

        // Set a click listener on that View
        jazz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView rap= (TextView) findViewById(R.id.rap);

        // Set a click listener on that View
        rap.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, RapActivity.class);
                startActivity(numbersIntent);
            }
        });



    }
}
