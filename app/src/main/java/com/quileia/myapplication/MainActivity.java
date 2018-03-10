package com.quileia.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Capitan capitan;

    @Inject
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MainApp)getApplicationContext()).getComponente().injectMain(this);

        //System.out.println("valor main es "+capitan.getEscudoNombre());

        System.out.println("valor main es "+context.getApplicationContext());

        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);


    }
}
