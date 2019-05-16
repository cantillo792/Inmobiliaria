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
public class Inmueble {
   private String ubicacion;
   private double MetroC;

    public Inmueble(String ubicacion, double MetroC) {
        this.ubicacion = ubicacion;
        this.MetroC = MetroC;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getMetroC() {
        return MetroC;
    }

    public void setMetroC(double MetroC) {
        this.MetroC = MetroC;
    }
    
   
   
   
}
