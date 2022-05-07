package com.equipo5.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {
  Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void AgendarCita(View view) {
        Intent intent = new Intent(mContext , Agendar_Cita.class);
        startActivity(intent);
    }

    public void About(View view) {
        Intent intent = new Intent(mContext , About.class);
        startActivity(intent);
    }

    public void Mi_Perfil(View view) {
        Intent intent = new Intent(mContext , Mi_Perfil.class);
        startActivity(intent);
    }

    public void Tus_Citas(View view) {
        Intent intent = new Intent(mContext , Tus_Citas.class);
        startActivity(intent);
    }

    public void Iniciar_Sesion(View view) {
        Intent intent = new Intent(mContext , Iniciar_Sesion.class);
        startActivity(intent);
    }

    public void Mi_Clinica(View view) {
        Intent intent = new Intent(mContext , Mi_Clinica.class);
        startActivity(intent);
    }

}