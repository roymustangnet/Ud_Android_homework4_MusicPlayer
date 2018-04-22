package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<MusicItem> musics = new ArrayList<MusicItem>();
        final String[] musicnames = {"WILL", "海阔天空","红豆","女驸马","青青河边草","生活不止眼前的苟且","爱的路上只有我和你","大海","大约在冬季"};
        String[] singers = {"米仓千寻", "Beyond","王菲","严凤英","高胜美","许巍","任贤齐","张雨生","齐秦"};
        String[] albums = {"ALIVE", "海阔天空","Eyes on me","黄梅戏珍藏","高胜美镭射金曲","生活不止眼前的苟且","飞鸟","大海","柔情主义万岁"};
        int[] imageIds = {R.drawable.album_alive,
                R.drawable.albums_haikuotiankong,
                R.drawable.albums_eyes_on_me,
                R.drawable.albums_huangmeixizhencang,
                R.drawable.albums_gaoshengmei,
                R.drawable.albums_xuwei,
                R.drawable.albums_feiniao,
                R.drawable.albums_dahai,
                R.drawable.albums_rouqingzhuyi
        };

        for(int i = 0; i < musicnames.length; i++){
            musics.add(new MusicItem(musicnames[i],
                    singers[i],
                    albums[i],
                    imageIds[i]));
        }

        MusicItemsAdapter adapter = new MusicItemsAdapter(this,musics);
        ListView listview = (ListView) findViewById(R.id.list_view);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MusicItem music = musics.get(position);
                Intent intent = new Intent(MainActivity.this, PlayActivity.class);
                intent.putExtra("musicName", music.getMusicName());
                intent.putExtra("singer", music.getSinger());
                intent.putExtra("album", music.getAlbum());
                intent.putExtra("resourceId", music.getResourceId());

                startActivity(intent);

            }
        });
    }
}
