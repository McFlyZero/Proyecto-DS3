package com.equipo5.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Detalles_Cita extends AppCompatActivity {
    Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_cita);
    }

    public void Reagendar_Cita(View view) {
        Intent intent = new Intent(mContext , Reagendar_Cita.class);
        startActivity(intent);
    }
}