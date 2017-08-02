package com.example.ashwin.debuglog;

import android.util.Log;

import org.json.JSONException;

/**
 * Created by Ashwin on 02-08-2017.
 */

public class DebugLogger {

    private static final String TAG = DebugLogger.class.getSimpleName();

    /**
     * Default tag
     */
    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (BuildConfig.DEBUG) {
            Log.e(TAG, msg);
        }
    }

    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            Log.i(TAG, msg);
        }
    }

    public static void v(String msg) {
        if (BuildConfig.DEBUG) {
            Log.v(TAG, msg);
        }
    }

    public static void wtf(String msg) {
        if (BuildConfig.DEBUG) {
            Log.wtf(TAG, msg);
        }
    }

    /**
     * Custom tags
     */
    public static void d(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.w(tag, msg);
        }
    }

    public static void wtf(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.wtf(tag, msg);
        }
    }

    public static void e(String tag, String s, JSONException e) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, s, e);
        }
    }
}
