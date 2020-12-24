package com.example.rentcarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");
        if (ConnectDB.getConnection() == null){
            Log.d(TAG, "onCreate: null");
            Toast.makeText(getBaseContext(),"NULL",Toast.LENGTH_SHORT).show();
        }else {
            Log.d(TAG, "onCreate: ok");
            Toast.makeText(getBaseContext(),"OK",Toast.LENGTH_SHORT).show();
        }
    }

}