package com.example;

import android.app.Application;

import com.appbrain.AppBrain;

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppBrain.init(this);
    }
}
