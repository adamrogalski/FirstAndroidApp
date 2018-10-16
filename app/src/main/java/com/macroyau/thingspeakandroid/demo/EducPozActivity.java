package com.macroyau.thingspeakandroid.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.macroyau.thingspeakandroid.ThingSpeakServiceLastFeed;
import com.macroyau.thingspeakandroid.model.Feed;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;


public class EducPozActivity extends AppCompatActivity {

    private TextView temp;
    private String test = "Test";

    private Long channelId = 602058L;

    private String baseUrl;
    private ThingSpeakServiceLastFeed thingSpeakServiceLastFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educ_poz);

        temp = findViewById(R.id.temp_edu);
        temp.setText(new String(" 21°C"));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ThingSpeakServiceLastFeed thingSpeakServiceLastFeed = retrofit.create(ThingSpeakServiceLastFeed.class);

        Response<Feed> response = thingSpeakServiceLastFeed.getLastFeed(channelId).execute();


    }




}
