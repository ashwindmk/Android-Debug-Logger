package com.example.ashwin.debuglog;

import android.util.Log;

import org.json.JSONException;

/**
 * Created by ashwin on 02-08-2017.
 */
public class DebugLogger {

    private static final String TAG = DebugLogger.class.getSimpleName();
    public static boolean sSHOULD_LOG;

    /**
     * Default tags
     */
    public static void d(String msg) {
        if (sSHOULD_LOG) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (sSHOULD_LOG) {
            Log.e(TAG, msg);
        }
    }

    public static void i(String msg) {
        if (sSHOULD_LOG) {
            Log.i(TAG, msg);
        }
    }

    public static void v(String msg) {
        if (sSHOULD_LOG) {
            Log.v(TAG, msg);
        }
    }

    public static void w(String msg) {
        if (sSHOULD_LOG) {
            Log.w(TAG, msg);
        }
    }

    public static void wtf(String msg) {
        if (sSHOULD_LOG) {
            Log.wtf(TAG, msg);
        }
    }

    public static void e(String s, JSONException e) {
        if (sSHOULD_LOG) {
            Log.e(TAG, s, e);
        }
    }

    /**
     * Custom tags
     */
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
