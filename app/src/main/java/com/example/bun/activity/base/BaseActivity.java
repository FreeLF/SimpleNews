package com.example.bun.activity.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by leif
 * Data 2018/2/13.
 */

public class BaseActivity extends AppCompatActivity {

    public String TAG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getComponentName().getShortClassName();
    }
}
