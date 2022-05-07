package com.equipo5.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Reagendar_Cita extends AppCompatActivity {
    Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reagendar_cita);
    }

    public void Tus_Citas(View view) {
        Intent intent = new Intent(mContext , Tus_Citas.class);
        startActivity(intent);
    }
}