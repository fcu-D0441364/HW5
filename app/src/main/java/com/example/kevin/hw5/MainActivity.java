package com.example.kevin.hw5;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    public class AlbumItem {
        String name;
        int imgid;
        AlbumItem(String name, int imgid) {
            this.name = name;
            this.imgid = imgid;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();

        albumlist.add(new AlbumItem("Grizzlies                        95",R.drawable.grizzlies));
        albumlist.add(new AlbumItem("Spurs                              116",R.drawable.spurs));
        albumlist.add(new AlbumItem("Rockets                          94",R.drawable.rockets));
        albumlist.add(new AlbumItem("Warriors                        121",R.drawable.worriors));

        AlbumArrayAdapter adapter = new AlbumArrayAdapter(this, albumlist);

        setListAdapter(adapter);
    }

    /*@Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        int [] imageIds = null;
        int columns = 3;
        switch(position) {
            case 0:
                imageIds = new int[6];
                imageIds[0] = R.drawable.hm001;
                imageIds[1] = R.drawable.hm002;
                imageIds[2] = R.drawable.hm003;
                imageIds[3] = R.drawable.hm004;
                imageIds[4] = R.drawable.hm005;
                imageIds[5] = R.drawable.hm006;
                columns = 2;
                break;
            case 1:
                imageIds = new int[5];
                imageIds[0] = R.drawable.sc001;
                imageIds[1] = R.drawable.sc002;
                imageIds[2] = R.drawable.sc003;
                imageIds[3] = R.drawable.sc004;
                imageIds[4] = R.drawable.sc005;
                break;
        }
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, GridActivity.class);
        intent.putExtra("KEY_IDS", imageIds);
        intent.putExtra("KEY_COLUMNS", columns);
        startActivity(intent);
    }*/
}
