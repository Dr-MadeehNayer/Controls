package com.madeeh.controls;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ProgressDialogControl extends ActionBarActivity {


    ProgressDialog barProgressDialog;
    Button btn;
    Handler updateBarHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_dialog_control);

        btn=(Button)findViewById(R.id.btn_invoke);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Invoke();
            }
        });

        updateBarHandler = new Handler();

    }


    public void Invoke() {

        barProgressDialog = new ProgressDialog(ProgressDialogControl.this);
        barProgressDialog.setTitle("Processing...");
        barProgressDialog.setMessage("in progress ...");
        barProgressDialog.setProgressStyle(barProgressDialog.STYLE_HORIZONTAL);
        barProgressDialog.setProgress(0);
        barProgressDialog.setMax(100);
        barProgressDialog.show();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    while (barProgressDialog.getProgress() <= barProgressDialog.getMax()) {
                        Thread.sleep(300);
                        updateBarHandler.post(new Runnable() {
                            public void run() {
                                barProgressDialog.incrementProgressBy(5);
                            }
                        });

                        if (barProgressDialog.getProgress() == barProgressDialog.getMax()) {
                            barProgressDialog.dismiss();
                        }
                    }

                }
                catch (Exception e) {

                }

            }

        }).start();

    }



}
