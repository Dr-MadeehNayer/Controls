package com.madeeh.controls;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EditTextControl extends ActionBarActivity {

    Button btn_valid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_control);

        btn_valid=(Button)findViewById(R.id.btn_validate);

        btn_valid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validate controls here
            }
        });

        final EditText txtEdit = (EditText) findViewById(R.id.et_email);

        txtEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    //validate here
                    String enteredEmail=txtEdit.getText().toString();
                    boolean isValid= isValidEmail(enteredEmail);
                    if(!isValid){
                       // txtEdit.requestFocus();
                        txtEdit.setError("This is not a valid email");
                    }
                }
            }
        });
    }

    // validating email id
    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    // validating password with retype password
    private boolean isValidPassword(String pass) {
        if (pass != null && pass.length() > 6) {
            return true;
        }
        return false;
    }

    private boolean isValidUrl(String url) {
        Pattern p = Patterns.WEB_URL;
        Matcher m = p.matcher(url);
        if(m.matches())
            return true;
        else
            return false;
    }

}
