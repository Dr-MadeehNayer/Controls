package com.madeeh.controls;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class RadioGroupControl extends ActionBarActivity {

    Button btn;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group_control);

        rg=(RadioGroup)findViewById(R.id.radioGroup);
        btn=(Button)findViewById(R.id.btn_selected);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rb_selected_id=rg.getCheckedRadioButtonId();

                rb=(RadioButton)findViewById(rb_selected_id);

                Toast.makeText(getApplicationContext(),rb.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }



}
