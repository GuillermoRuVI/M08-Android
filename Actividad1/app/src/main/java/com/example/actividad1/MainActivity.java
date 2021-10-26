package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void run (View view) {
        EditText tv = (EditText) findViewById(R.id.texto);
        Uri uri = Uri.parse(tv.getText().toString());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("EJEMPLO1", "onStart funciona");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("EJEMPLO1", "onResume funciona");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("EJEMPLO1", "onPause funciona");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("EJEMPLO1", "onStop funciona");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("EJEMPLO1", "onRestart funciona");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("EJEMPLO1", "onDestroy funciona");
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void pantalla1 (View view) {
        Intent intent = new Intent(this, Pantalla1.class);
        startActivity(intent);
    }
}