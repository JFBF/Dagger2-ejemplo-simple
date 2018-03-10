package com.quileia.myapplication;

import android.app.Application;

import com.quileia.myapplication.Componente;
import com.quileia.myapplication.DaggerComponente;
import com.quileia.myapplication.Modulo;

/**
 * Created by Felipe on 9/03/2018.
 */

public class MainApp extends Application{
    private Componente componente;

    @Override
    public void onCreate() {
        super.onCreate();

        componente = DaggerComponente
                .builder()
                .modulo(new Modulo(this))
                .build();
    }

    public Componente getComponente() {
        return componente;
    }
}
