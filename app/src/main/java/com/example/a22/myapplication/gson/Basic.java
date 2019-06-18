package com.example.a22.myapplication.gson;
import com.google.gson.annotations.SerializedName;
/**
 * Created by stu on 2019/6/17.
 */

public class Basic {
    //"city"与cityName建立映射关系
    @SerializedName("city")
    public String cityName;

    //"id"与weatherId建立映射关系
    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;
    public class Update{
        //"loc"与updateTime建立映射关系
        @SerializedName("loc")
        public String updateTime;
    }
}
