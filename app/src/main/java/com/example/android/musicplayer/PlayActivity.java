package com.example.android.musicplayer;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        displayData();
    }

    private void displayData(){
        setTitle("音乐详情");
        Intent intent = getIntent();
        String musicName = intent.getStringExtra("musicName");
        String singer = intent.getStringExtra("singer");
        String album = intent.getStringExtra("album");
        int resouceId = intent.getIntExtra("resourceId",0);

        TextView musicNameTextView = (TextView) findViewById(R.id.music_name_text_view);
        musicNameTextView.setText(musicName+" - " +album);
        TextView singerTextView = (TextView) findViewById(R.id.singer_name);
        singerTextView.setText(singer);
        ImageView albumImageview = (ImageView) findViewById(R.id.album_imageview);
        albumImageview.setImageResource(resouceId);



    }
}
