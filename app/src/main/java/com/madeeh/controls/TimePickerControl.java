package com.madeeh.controls;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class TimePickerControl extends ActionBarActivity {

    TimePicker timepicker;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_control);

        btn=(Button)findViewById(R.id.btn_time);
        timepicker=(TimePicker)findViewById(R.id.timePicker1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hour = timepicker.getCurrentHour();
                int min = timepicker.getCurrentMinute();

                Toast.makeText(getApplicationContext(),hour+":"+min,Toast.LENGTH_SHORT).show();
            }
        });

    }

    //by the way, to construct a date:
    Date setDate(int year,int month,int day){
       return new Date(year,month,day);
    }


    Date setDate(int year,int month,int day,int hour,int minute){
        return new Date(year,month,day,hour,minute);
    }

    //to get whatever
    void getPartials(Date dd){
        int hr=dd.getHours();
        int min=dd.getMinutes();
    }

}
