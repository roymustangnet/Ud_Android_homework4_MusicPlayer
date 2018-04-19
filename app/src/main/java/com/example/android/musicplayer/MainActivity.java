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
        String[] musicnames = {"今生情不变","海阔天空","红豆","女驸马","青青河边草","生活不止眼前的苟且"};
        String[] singers = {"林志豪","Beyond","王菲","严凤英","高胜美","许巍"};
        String[] albums = {"乐作剧","海阔天空","Eyes on me","黄梅戏珍藏","电视剧原声","生活不止眼前的苟且"};
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
