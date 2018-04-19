package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MusicItem> musics = new ArrayList<MusicItem>();
        String[] musicnames = {};
        String[] singers = {};
        String[] albums = {};
//        musics.add(new MusicItem(""))
        for(int i = 0; i < musicnames.length; i++){
            musics.add(new MusicItem(musicnames[i],
                    singers[i],
                    albums[i]));
        }

        MusicItemsAdapter adapter = new MusicItemsAdapter(this,musics);
        ListView listview = (ListView) findViewById(R.id.list_view);
        listview.setAdapter(adapter);
    }
}
