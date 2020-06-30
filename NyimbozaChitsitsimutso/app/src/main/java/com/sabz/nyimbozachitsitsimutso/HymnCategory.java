package com.sabz.nyimbozachitsitsimutso;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class HymnCategory extends AppCompatActivity {
    private ArrayAdapter listAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn_category1);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Hymns");
        actionBar.setDisplayHomeAsUpEnabled(true);

        listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Hymns.hymns);
        ListView listHymns=(ListView)findViewById(R.id.list_hymns);
        listHymns.setAdapter(listAdapter);
        EditText theFilter=(EditText)findViewById(R.id.search_text);
        theFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                (HymnCategory.this).listAdapter.getFilter().filter(s);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        //create the listener
        AdapterView.OnItemClickListener itemClickListener=
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listHymns,
                                            View ItemView,
                                            int position,
                                            long id) {
                        // Pass the Hymn the user clicks in Hymns activity
                        Intent intent=new Intent(HymnCategory.this,
                                HymnActivity.class);

                        intent.putExtra(HymnActivity.EXTRA_HYMNID,(int) id);
                        startActivity(intent);
                    }
                };
        //Assign the listener to the list view
        listHymns.setOnItemClickListener(itemClickListener);




    }
}