package com.example.xyzreader.remote;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

class Config {
    static final URL BASE_URL;
    @SuppressLint("StaticFieldLeak")
    private static Context context;
    private static final String TAG = Config.class.toString();

    private Config(Context context) {
        Config.context = context;
    }

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (MalformedURLException ignored) {
            Toast.makeText(context,"Please check your internet connection.",Toast.LENGTH_SHORT).show();
            Log.e(TAG, "Please check your internet connection.");
        }
        BASE_URL = url;
    }
}
