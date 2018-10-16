package com.macroyau.thingspeakandroid.demo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SetChoiceActivity extends AppCompatActivity {

    private ImageView alertButtonSopot;
    private ImageView alertButtonTatry;
    private ImageView alertButtonWarszawa;
    private ImageView alertButtonParyz;
    private ImageView alertButtonLondyn;
    private ImageView alertButtonRio;
    private TextView alertTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_choice);

        alertTextView = (TextView) findViewById(R.id.alert);
        alertButtonSopot = (ImageView) findViewById(R.id.sopot_img);
        alertButtonTatry = (ImageView) findViewById(R.id.tatry_img);
        alertButtonWarszawa = (ImageView) findViewById(R.id.waraszawa_img);
        alertButtonParyz = (ImageView) findViewById(R.id.paryz_img);
        alertButtonLondyn = (ImageView) findViewById(R.id.londyn_img);
        alertButtonRio = (ImageView) findViewById(R.id.rio_img);

        alertButtonSopot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SetChoiceActivity.this);

                builder.setTitle("Brak zestawu czujników");
                builder.setMessage("Nie wykryto żadnego zestawu czujników. Pozdłącz zestaw do aplikacji ThingSpeak.");


                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });

        alertButtonTatry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SetChoiceActivity.this);

                builder.setTitle("Brak zestawu czujników");
                builder.setMessage("Nie wykryto żadnego zestawu czujników. Pozdłącz zestaw do aplikacji ThingSpeak.");


                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });

        alertButtonWarszawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SetChoiceActivity.this);

                builder.setTitle("Brak zestawu czujników");
                builder.setMessage("Nie wykryto żadnego zestawu czujników. Pozdłącz zestaw do aplikacji ThingSpeak.");


                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });

        alertButtonParyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SetChoiceActivity.this);

                builder.setTitle("Brak zestawu czujników");
                builder.setMessage("Nie wykryto żadnego zestawu czujników. Pozdłącz zestaw do aplikacji ThingSpeak.");


                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });

        alertButtonLondyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SetChoiceActivity.this);

                builder.setTitle("Brak zestawu czujników");
                builder.setMessage("Nie wykryto żadnego zestawu czujników. Pozdłącz zestaw do aplikacji ThingSpeak.");


                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });

        alertButtonRio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SetChoiceActivity.this);

                builder.setTitle("Brak zestawu czujników");
                builder.setMessage("Nie wykryto żadnego zestawu czujników. Pozdłącz zestaw do aplikacji ThingSpeak.");


                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });
    }

    public void poznan(View view) {
        Intent intent = new Intent(SetChoiceActivity.this, PoznanActivity.class);
        startActivity(intent);
    }

    public void inowroclaw(View view) {
        Intent intent = new Intent(SetChoiceActivity.this, InowroclawActivity.class);
        startActivity(intent);
    }

}
