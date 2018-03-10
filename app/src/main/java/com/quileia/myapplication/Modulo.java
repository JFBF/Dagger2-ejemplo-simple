package com.quileia.myapplication;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Felipe on 9/03/2018.
 */

@Module
public class Modulo {

    private final Context context;

    public Modulo(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Escudo provideEscudo(){
        return new Escudo();
    }

    @Provides
    @Singleton
    public Capitan provideCapitan(Escudo escudo){
        System.out.println("creando capitan");
        return new Capitan(escudo);
    }


    @Provides
    @Singleton
    public Context getContext() {
        return context;
    }
}
