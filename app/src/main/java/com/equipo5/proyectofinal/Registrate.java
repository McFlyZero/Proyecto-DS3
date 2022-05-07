package com.equipo5.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registrate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate);
    }

    public void CrearCuenta(View view) {
        Intent intent = new Intent(Registrate.this, Iniciar_Sesion.class);
        startActivity(intent);
    }

    public void IniciarSesion(View view) {
        Intent intent = new Intent(Registrate.this, Iniciar_Sesion.class);
        startActivity(intent);
    }
}