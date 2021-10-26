package com.example.actividad1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        Log.i("EJEMPLO1", "Actividad 2 funciona");
    }

    public void izquierda (View view) {
        Intent intent = new Intent(this, Pantalla2.class);
        startActivity(intent);
    }

    public void derecha (View view) {
        Intent intent = new Intent(this, Pantalla4.class);
        startActivity(intent);
    }
}