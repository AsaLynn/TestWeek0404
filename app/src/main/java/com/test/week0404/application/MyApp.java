package com.test.week0404.application;

import com.example.demonstrate.appliaction.CommonApp;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by think on 2018/3/26.
 */

public class MyApp extends CommonApp {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
