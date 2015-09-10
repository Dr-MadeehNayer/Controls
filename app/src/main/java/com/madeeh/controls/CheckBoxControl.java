package com.madeeh.controls;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class CheckBoxControl extends ActionBarActivity {

    Button btn;
    CheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_control);

        btn=(Button)findViewById(R.id.btn_ok);
        chk=(CheckBox)findViewById(R.id.chk_send);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chk.isChecked()){
                    Show("checked!");
                }
                else{
                    Show("not checked!");
                }
            }
        });
    }

    private void Show(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }



}
