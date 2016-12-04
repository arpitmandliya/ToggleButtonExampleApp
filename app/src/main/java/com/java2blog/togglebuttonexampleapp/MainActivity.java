package com.java2blog.togglebuttonexampleapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;

import static android.webkit.WebSettings.PluginState.ON;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    private Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (toggleButton.isChecked()) {

                    Toast.makeText(activity, "Toggle button is in ON State", Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(activity, "Toggle button is in OFF State", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
