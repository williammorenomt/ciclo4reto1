package com.example.bicipartes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_icon);
    }

    //metodo para mostrar y ocultar el menu
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.barra_tareas,menu);
        return true;
    }
    // asignar funciones correspondientes
    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Item1){
            Toast.makeText(this,"Productos",Toast.LENGTH_SHORT).show();
            Intent in = new Intent(Inicio.this,Productos.class);
            startActivity(in);
        }
        else if (id == R.id.Item2){
            Toast.makeText(this,"Servicios",Toast.LENGTH_SHORT).show();
            Intent in = new Intent(Inicio.this,Servicios.class);
            startActivity(in);
        }
        else if (id == R.id.Item3){
            Toast.makeText(this,"Sucursales",Toast.LENGTH_SHORT).show();
            Intent in = new Intent(Inicio.this,sucursales.class);
            startActivity(in);
        }
        return super.onOptionsItemSelected(item);
    }
}