package com.example.a22.myapplication.gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by StarDream on 2019/6/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
