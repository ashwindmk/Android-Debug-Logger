package com.example.ashwin.debuglogexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ashwin.debuglog.DebugLogger;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Default tag
        DebugLogger.d("Test log");

        // Custom tag
        DebugLogger.d(TAG, "Test log");
    }
}
