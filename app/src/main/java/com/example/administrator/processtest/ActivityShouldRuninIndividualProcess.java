package com.example.administrator.processtest;

import android.app.Activity;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by zhanghuancheng on 2018/4/9.
 */

public class ActivityShouldRuninIndividualProcess extends Activity {
    private static final String TAG = "zhc";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: hahaha");
        Log.d(TAG, "onCreate: " + Process.myPid());
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
