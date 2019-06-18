package com.example.a22.myapplication.util;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by stu on 2019/6/17.
 */

public class HttpUtil {
    //与服务器进行交互发起一条http请求只需要调用sendOkHttpRequest()即可
    //传入要请求的地址，注册一个回调来处理服务器的响应
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request =  new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
