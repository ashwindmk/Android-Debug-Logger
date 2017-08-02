package com.example.ashwin.debuglog;

import android.util.Log;

import org.json.JSONException;

/**
 * Created by pavitra on 22/9/15.
 */
public class Logger {

    public static boolean sSHOULD_LOG;

    public static void d(String tag, String msg) {
        if (sSHOULD_LOG) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (sSHOULD_LOG) {
            Log.e(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (sSHOULD_LOG) {
            Log.i(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (sSHOULD_LOG) {
            Log.v(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (sSHOULD_LOG) {
            Log.w(tag, msg);
        }
    }

    public static void wtf(String tag, String msg) {
        if (sSHOULD_LOG) {
            Log.wtf(tag, msg);
        }
    }

    public static void e(String tag, String s, JSONException e) {
        if (sSHOULD_LOG) {
            Log.e(tag, s, e);
        }
    }
}
