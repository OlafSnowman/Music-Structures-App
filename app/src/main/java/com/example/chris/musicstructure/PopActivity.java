package com.example.chris.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Girls Like You", "2017"));
        songs.add(new Song("We Found Love", "2011"));
        songs.add(new Song("Bad Romance", "2009"));
        songs.add(new Song("Shake It Off", "2014"));
        songs.add(new Song("Better Now", "2018"));

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
                Intent numbersIntent = new Intent(PopActivity.this, MainActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}
