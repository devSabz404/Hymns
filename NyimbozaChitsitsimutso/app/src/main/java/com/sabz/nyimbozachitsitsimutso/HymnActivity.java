package com.sabz.nyimbozachitsitsimutso;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class HymnActivity extends AppCompatActivity {

    public static final String EXTRA_HYMNID ="hymnId" ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Nyimbo");
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Get hymn from intent
        int hymnId=(Integer)getIntent().getExtras().get(EXTRA_HYMNID);
        Hymns hymns=Hymns.hymns[hymnId];
        // Populate the hymn number
        TextView hymnTitle=(TextView) findViewById(R.id.hymnTitle);
        hymnTitle.setText(hymns.getHymnTitle());
        //populate lyrics
        TextView hymnLyrics=(TextView) findViewById(R.id.hymnLyrics);
        hymnLyrics.setText(hymns.getHymnLyrics());

    }
}