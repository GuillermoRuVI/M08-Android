package com.example.actividad1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        Log.i("EJEMPLO1", "Actividad 2 funciona");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.stucom.com"));
        startActivity(intent);
    }
}