package com.iesvirgendelcarmen.dam.recuperacion03;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by matinal on 12/04/2018.
 */

public class Fragmento3 extends Fragment {
    public Contenido.Lista_entrada mItem;
    public static final String ARG_ID_ENTRADA_SELECCIONADA="item_id";
    public Fragmento3(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments().containsKey(ARG_ID_ENTRADA_SELECCIONADA)){
            mItem=Contenido.ENT_LISTA_HASMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECCIONADA));
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_detalle, container, false);
        if(mItem !=null){
            ((TextView)view.findViewById(R.id.textotitulo)).setText(mItem.textoEncima);
            ((TextView)view.findViewById(R.id.textocontenido)).setText(mItem.textoDebajo);
            ((ImageView)view.findViewById(R.id.imagen)).setImageResource(mItem.idImagen);
        }
        return view;
    }
}
