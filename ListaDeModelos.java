package com.example.bd.mannequincollection;

import android.content.Intent;
import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import java.util.ArrayList;

public class ListaDeModelos extends AppCompatActivity {

    Button reg;
    InterfazBD iBD;
    ListView lv, lv2, lv3;
    ArrayList<String> modelitos = new ArrayList<String>();
    ArrayList<String> nacionalidades = new ArrayList<String>();
    ArrayList<Integer> edades = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_modelos);
        reg = (Button) findViewById(R.id.btVolver);
        lv = (ListView) findViewById(R.id.listaModelas);
        lv2 = (ListView) findViewById(R.id.listaNacionalidades);
        lv3 = (ListView) findViewById(R.id.listaEdades);
        traerDatos();
        traerDatos2();
        ArrayAdapter<String> adaptador1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, modelitos);
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nacionalidades);
        ArrayAdapter<Integer> adaptador3 = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, edades;
        lv.setAdapter(adaptador1);
        lv2.setAdapter(adaptador2);
        lv3.setAdapter(adaptador3);
    }

    public void regresar (View v) {
        Intent intent = new Intent(ListaDeModelos.this, Modelos.class);
        startActivity(intent);
    }

    public void traerDatos(){
        iBD = new InterfazBD(this);
        Cursor c = iBD.listaModelos();
        if(c.moveToFirst()){
            do{
                modelitos.add(c.getString(c.getColumnIndex("nombre")));
            } while(c.moveToNext());
        }
    }

    public void traerDatos2(){
        iBD = new InterfazBD(this);
        Cursor c = iBD.listaNacionalidades();
        if(c.moveToFirst()){
            do{
                nacionalidades.add(c.getString(c.getColumnIndex("nacionalidad")));
            } while(c.moveToNext());
        }
    }

    public void traerDatos3(){
        iBD = new InterfazBD(this);
        Cursor c = iBD.listaNacionalidades();
        if(c.moveToFirst()){
            do{
                edades.add(c.getInt(c.getColumnIndex("edad")));
            } while(c.moveToNext());
        }
    }


}
