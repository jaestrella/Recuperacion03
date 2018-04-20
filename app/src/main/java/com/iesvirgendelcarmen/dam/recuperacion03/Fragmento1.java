package com.iesvirgendelcarmen.dam.recuperacion03;

import android.app.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by matinal on 06/04/2018.
 */

public class Fragmento1 extends ListFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new Adaptador(getActivity(),R.layout.layout_listado,Contenido.ENT_LISTA){
            @Override
            public void onEntrada(Object entrada, View view) {

                TextView texto_superior_entrada=(TextView)view.findViewById(R.id.textoTitulo);
                texto_superior_entrada.setText(((Contenido.Lista_entrada)entrada).textoEncima);

                ImageView imagen_entrada=(ImageView)view.findViewById(R.id.imagenLista);
                imagen_entrada.setImageResource(((Contenido.Lista_entrada)entrada).idImagen);
            }
        });
    }

    public interface Callbacks{public void onEntradaSeleccionada(String id);}

    private static Callbacks callbacksVacios=new Callbacks() {
        @Override
        public void onEntradaSeleccionada(String id) {

        }
    };

    public Fragmento1(){}

    Callbacks mCallbacks;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mCallbacks=(Callbacks)activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks=callbacksVacios;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        mCallbacks.onEntradaSeleccionada(Contenido.ENT_LISTA.get(position).id);
    }
}
