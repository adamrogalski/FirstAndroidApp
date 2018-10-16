package com.macroyau.thingspeakandroid.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class PoznanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poznan);
    }

    public void temp_poznan(View view) {
        Intent intent = new Intent(PoznanActivity.this, TempPozActivity.class);
        startActivity(intent);
    }

    public void humi_poznan(View view) {
        Intent intent = new Intent(PoznanActivity.this, HumiPozActivity.class);
        startActivity(intent);
    }

    public void pres_poznan(View view) {
        Intent intent = new Intent(PoznanActivity.this, PresPozActivity.class);
        startActivity(intent);
    }

    public void ligh_poznan(View view) {
        Intent intent = new Intent(PoznanActivity.this, LighPozActivity.class);
        startActivity(intent);
    }

    public void info_poznan(View view) {
        Intent intent = new Intent(PoznanActivity.this, InfoPozActivity.class);
        startActivity(intent);
    }

    public void edu_poznan(View view) {
        Intent intent = new Intent(PoznanActivity.this, EducPozActivity.class);
        startActivity(intent);
    }
}