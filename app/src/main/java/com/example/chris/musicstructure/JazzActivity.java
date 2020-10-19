package com.example.chris.musicstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Jazz", "2014"));
        songs.add(new Song("Jazzy", "2011"));
        songs.add(new Song("Another Jazz", "2007"));
        songs.add(new Song("Jazzier", "2016"));
        songs.add(new Song("Jazest", "2012"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Find the View that shows the numbers category
        Button goBack= (Button) findViewById(R.id.button);

        // Set a click listener on that View
        goBack.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(JazzActivity.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });

    }
}
