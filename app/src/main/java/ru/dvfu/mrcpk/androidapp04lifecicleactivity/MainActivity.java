package ru.dvfu.mrcpk.androidapp04lifecicleactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "myLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "method onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "method onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "method onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "method onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "method onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "method onDestroy()");
    }
}
