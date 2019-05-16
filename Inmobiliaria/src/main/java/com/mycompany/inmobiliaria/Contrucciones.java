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
public class Contrucciones extends Inmueble{
    private int precio;
    private int NunHabitaciones;
    private int piso;
    private int PrecioMC;

    public Contrucciones(int precio, int NunHabitaciones, int piso, String ubicacion, double MetroC) {
        super(ubicacion, MetroC);
        this.precio = precio;
        this.NunHabitaciones = NunHabitaciones;
        this.piso = piso;
    }

    public Contrucciones(int PrecioMC, String ubicacion, double MetroC) {
        super(ubicacion, MetroC);
        this.PrecioMC = PrecioMC;
    }
    
    public int getPrecio() {
        return precio;
    }

    public int getNunHabitaciones() {
        return NunHabitaciones;
    }

    public int getPiso() {
        return piso;
    }

    public int getPrecioMC() {
        return PrecioMC;
    }
    
    
    

    
    
}
