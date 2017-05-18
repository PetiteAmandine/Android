package com.example.bd.mannequincollection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    LinearLayout principal;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        principal = (LinearLayout) findViewById(R.id.principal);
        texto = (TextView) findViewById(R.id.textView);
    }

    public void irModelos (View v){
        Intent intent = new Intent(MainActivity.this, Modelos.class);
        startActivity(intent);
    }


}
