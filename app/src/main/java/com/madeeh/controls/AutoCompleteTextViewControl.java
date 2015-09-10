package com.madeeh.controls;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;


public class AutoCompleteTextViewControl extends ActionBarActivity {

    AutoCompleteTextView autocomplete;
    ArrayAdapter<String> adapter;
    String[] arr = { "madeeh","sultan","hani","khalid","ziz","mohammed","yasser","morad","ayman","anwar","ahlam"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme);
        setContentView(R.layout.activity_auto_complete_text_view_control);

        autocomplete = (AutoCompleteTextView) findViewById(R.id.tv_auto);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        autocomplete.setAdapter(adapter);

        autocomplete.setThreshold(1);

        autocomplete.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getBaseContext(), "Item Selected: " + adapterView.getItemAtPosition(position),Toast.LENGTH_LONG).show();

            }
        });
    }



}
