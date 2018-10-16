package com.macroyau.thingspeakandroid.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class InowroclawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inowroclaw);
    }

    public void temp_inowroclaw(View view) {
        Intent intent = new Intent(InowroclawActivity.this, TempInoActivity.class);
        startActivity(intent);
    }

    public void humi_inowroclaw(View view) {
        Intent intent = new Intent(InowroclawActivity.this, HumiInoActivity.class);
        startActivity(intent);
    }

    public void pres_inowroclaw(View view) {
        Intent intent = new Intent(InowroclawActivity.this, PresInoActivity.class);
        startActivity(intent);
    }

    public void ligh_inowroclaw(View view) {
        Intent intent = new Intent(InowroclawActivity.this, LighInoActivity.class);
        startActivity(intent);
    }

    public void info_inowroclaw(View view) {
        Intent intent = new Intent(InowroclawActivity.this, InfoInoActivity.class);
        startActivity(intent);
    }
}
