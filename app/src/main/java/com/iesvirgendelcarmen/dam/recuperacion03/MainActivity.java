package com.iesvirgendelcarmen.dam.recuperacion03;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements Fragmento1.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onEntradaSeleccionada(String id) {
        Intent detalleIntent=new Intent(this,Fragmento2.class);
        detalleIntent.putExtra(Fragmento3.ARG_ID_ENTRADA_SELECCIONADA,id);
        startActivity(detalleIntent);
        //Toast.makeText(this, "ELEMENTO SELECCIONADO "+id, Toast.LENGTH_SHORT).show();
    }
}
