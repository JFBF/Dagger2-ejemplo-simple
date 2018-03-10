package com.quileia.myapplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Felipe on 9/03/2018.
 */

@Singleton
@Component(modules = Modulo.class)
public interface Componente {

    void injectMain (MainActivity mainActivity);
    void injectMain2 (Main2Activity main2Activity);

}
