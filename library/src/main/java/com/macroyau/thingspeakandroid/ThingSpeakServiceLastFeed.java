package com.macroyau.thingspeakandroid;

import com.macroyau.thingspeakandroid.model.Feed;

import retrofit2.Call;
import retrofit.http.GET;
import retrofit.http.Path;

public interface ThingSpeakServiceLastFeed {

    @GET("/channels/{id}/feeds/last.json")
    Call<Feed> getLastFeed(@Path("id") Long channelId);
}