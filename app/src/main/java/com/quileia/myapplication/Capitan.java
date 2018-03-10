package com.quileia.myapplication;

import javax.inject.Inject;

/**
 * Created by Felipe on 9/03/2018.
 */

public class Capitan {

    private Escudo escudo;

    @Inject
    public Capitan( Escudo e){
        this.escudo = e;
    }

    public String getEscudoNombre() {
        return escudo.getNombre();
    }
}
