/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inmobiliaria;

/**
 *
 * @author Brians
 */

import java.util.ArrayList;

public class Superficie extends Inmueble{

    ArrayList<String> Zonarustica;
    ArrayList<String> urbana;
    ArrayList<String>garagePublico;
    ArrayList<String>garagePrivado; 
    private int preciometro;

    public Superficie(ArrayList<String> Zonarustica, ArrayList<String> urbana, String ubicacion, int metrocuadrado,
            ArrayList<String>garagePrivado,ArrayList<String>garagepublico) {
        super(ubicacion, metrocuadrado);
        this.Zonarustica = Zonarustica;
        this.urbana = urbana;
        this.garagePrivado= garagePrivado;
        this.garagePublico=garagePublico;

    }

    public Superficie(String ubicacion, int metrocuadrado) {
        super(ubicacion, metrocuadrado);
    }

    public ArrayList<String> getZonarustica() {
        return Zonarustica;
    }

    public ArrayList<String> getUrbana() {
        return urbana;
    }

    public int getPreciometro() {
        return preciometro;
    }

  

}