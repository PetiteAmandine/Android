package com.example.bd.mannequincollection;

import android.app.ListFragment;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.example.bd.mannequincollection.dummy.DummyContent;
import com.example.bd.mannequincollection.dummy.DummyContent.DummyItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
*/
public class FragmentoBusqueda extends ListFragment {

    InterfazBD iBD;
    EditText nombre;
    ArrayList<String> resultados = new ArrayList<String>();
    ListView lv;
    Cursor res;


    public FragmentoBusqueda() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = super.onCreateView(inflater, container, savedInstanceState);
        nombre = (EditText) v.findViewById(R.id.buscaNombre);
        lv = (ListView) v.findViewById(R.id.listaModelos);
        iBD = new InterfazBD(this.getActivity());
        //res = iBD.buscaModelos(nombre.getText().toString());
        meterDatos();
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, resultados);
        lv.setAdapter(adaptador);
        return v;
    }

    public void meterDatos(){
        resultados.add("Candice Swanepoel");
        resultados.add("Taylor Hill");
        resultados.add("Karlie Kloss");
        resultados.add("Kendall Jenner");
        resultados.add("Gigi Hadid");
        resultados.add("Cara Delevingne");
        resultados.add("Liu Wen");
        resultados.add("Marine Deleeuw");
        resultados.add("Hanne Gaby Odiele");
        resultados.add("Saskia de Brauw");
    }
}
