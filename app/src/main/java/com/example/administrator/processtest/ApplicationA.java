package com.example.administrator.processtest;

import android.app.Application;
import android.util.Log;

/**
 * Created by zhanghuancheng on 2018/4/9.
 */

public class ApplicationA extends Application {
    Integer a = new Integer(1);

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("zhc", "onCreate: ");
    }
}
