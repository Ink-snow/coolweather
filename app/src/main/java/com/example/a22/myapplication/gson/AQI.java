package com.example.a22.myapplication.gson;
import com.google.gson.annotations.SerializedName;
/**
 * Created by StarDream on 2019/6/17.
 */
public class AQI {
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public
        String aqi;

        @SerializedName("pm25")
        public
        String pm25;
    }
}