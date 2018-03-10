package com.quileia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    @Inject
    Capitan capitan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ((MainApp)getApplicationContext()).getComponente().injectMain2(this);
        System.out.println("valor main 2 es "+capitan.getEscudoNombre());

    }
}
