package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verUbicacion (View view){
        Intent intent = new Intent(this, localizacion.class);
        startActivity(intent);
    }
    public void buscarUbicacion (View view){
        Intent intent = new Intent(this, buscarLugar.class);
        startActivity(intent);
    }
}
