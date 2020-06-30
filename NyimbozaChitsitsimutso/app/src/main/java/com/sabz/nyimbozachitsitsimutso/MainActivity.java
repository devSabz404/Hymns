package com.sabz.nyimbozachitsitsimutso;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Menu optionsMenu;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pull,menu);
        optionsMenu=menu;
        MenuItem item = optionsMenu.findItem(R.id.app_bar_drop);
        item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                return false;
            }
        });
        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView,
                                    View itemView,
                                    int position,
                                    long id){
                if(position==0){
                    Intent intent=new Intent(MainActivity.this,
                            HymnCategory.class);
                    startActivity(intent);
                }
            }
        };



        ListView listView=(ListView) findViewById(R.id.list_choose);
        listView.setOnItemClickListener(itemClickListener);

    }



}