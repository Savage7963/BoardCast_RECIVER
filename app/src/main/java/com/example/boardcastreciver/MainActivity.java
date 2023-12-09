package com.example.boardcastreciver;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ExampleBroadcastReciver exampleBroadcastReciver = new ExampleBroadcastReciver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(exampleBroadcastReciver, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(exampleBroadcastReciver);
    }
}