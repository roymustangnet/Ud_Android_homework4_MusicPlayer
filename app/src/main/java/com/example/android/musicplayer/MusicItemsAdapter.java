package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicItemsAdapter extends ArrayAdapter<MusicItem> {


    public MusicItemsAdapter(Context context, ArrayList<MusicItem> musics){
        super(context, 0, musics);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_item, parent, false);
        }
        MusicItem music = getItem(position);

        TextView title = listItemView.findViewById(R.id.music_title);
        title.setText(music.getMusicName());
        TextView singer = listItemView.findViewById(R.id.singer);
        singer.setText(music.getSinger());
        TextView album = listItemView.findViewById(R.id.album);
        album.setText(music.getAlbum());

        return listItemView;
    }
}
