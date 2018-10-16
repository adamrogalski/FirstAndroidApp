package com.macroyau.thingspeakandroid.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.JsonObject;
import com.macroyau.thingspeakandroid.ThingSpeakService;
import com.macroyau.thingspeakandroid.model.Channel;
import com.macroyau.thingspeakandroid.model.ChannelFeed;
import com.macroyau.thingspeakandroid.model.Feed;
import com.macroyau.thingspeakandroid.model.PublicChannels;
import com.macroyau.thingspeakandroid.model.StatusUpdates;

import java.util.List;
import java.util.Map;

import retrofit.Callback;
import retrofit.client.Request;


public class EducPozActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educ_poz);




    }

};
