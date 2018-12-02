package com.example;

import android.app.Application;
import android.content.Context;

/**
 * Created by p1 on 2017-09-27.
 */

import static lukasz.p1.kraina1.Menu.kon; public class Kraina1 extends Application {
    public static Context context;

    public void onCreate() {
        super.onCreate();
        Kraina1.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return Kraina1.context;
    }
}
