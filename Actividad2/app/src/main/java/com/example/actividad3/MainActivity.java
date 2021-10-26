package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telefono (View view) {

        EditText txtMobile = (EditText)findViewById(R.id.telefono);
        EditText txtMessage = (EditText)findViewById(R.id.texto);
        String telString = txtMobile.getText().toString();
        String textString = txtMessage.getText().toString();

        recibirSMS(telString, textString);

    }

    public void recibirSMS(String telefono, String mensaje) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("sms:"));
        intent.putExtra("address", telefono);
        intent.putExtra("sms_body", mensaje);
        startActivity(intent);

        Toast.makeText(this, (telefono + " " + mensaje), Toast.LENGTH_SHORT).show();
    }
}