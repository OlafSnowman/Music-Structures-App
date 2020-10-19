package com.example.chris.musicstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Simple", "2018"));
        songs.add(new Song("Heaven", "2016"));
        songs.add(new Song("You Look Good", "2017"));
        songs.add(new Song("Tin Man", "2016"));
        songs.add(new Song("Drinkin Problem", "2015"));

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
                Intent numbersIntent = new Intent(CountryActivity.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}
