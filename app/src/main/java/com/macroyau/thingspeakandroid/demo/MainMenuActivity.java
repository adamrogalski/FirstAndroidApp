package com.macroyau.thingspeakandroid.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void set_choice(View view) {
        Intent intent = new Intent(MainMenuActivity.this, SetChoiceActivity.class);
        startActivity(intent);
    }

    public void info(View view) {
        Intent intent = new Intent(MainMenuActivity.this, InfoActivity.class);
        startActivity(intent);
    }

    /*public void poznan(View view) {
    }

    public void inowroclaw(View view) {
    }

    public void temp_poznan(View view) {
    }

    public void humi_poznan(View view) {
    }

    public void pres_poznan(View view) {
    }

    public void ligh_poznan(View view) {
    }


    public void temp_inowroclaw(View view) {
    }

    public void humi_inowroclaw(View view) {
    }

    public void pres_inowroclaw(View view) {
    }

    public void ligh_inowroclaw(View view) {
    }

    public void info_inowroclaw(View view) {
    }*/
}
