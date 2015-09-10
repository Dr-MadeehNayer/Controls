package com.madeeh.controls;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;


public class ToggleButtonControl extends ActionBarActivity {

    Button btn;
    ToggleButton tg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button_control);


        btn=(Button)findViewById(R.id.btn_ok);
        tg=(ToggleButton)findViewById(R.id.tg_send);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tg.isChecked()){
                    Show("checked!");
                }
                else{
                    Show("not checked!");
                }
            }
        });
    }

    private void Show(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
