package com.example.ashwin.debuglogexample;

import android.app.Application;

import com.example.ashwin.debuglog.DebugLogger;

/**
 * Created by Ashwin on 02-08-2017.
 */

public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Should log only in debug build variant
        DebugLogger.sSHOULD_LOG = BuildConfig.DEBUG;
    }
}
