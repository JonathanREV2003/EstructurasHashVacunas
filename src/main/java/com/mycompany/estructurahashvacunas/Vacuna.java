/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructurahashvacunas;

/**
 *
 * @author ALIENWARE
 */
public class Vacuna {
     private final String nombre;
    private final String fecha;

    // Constructor de la clase Vacuna
    public Vacuna(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    // Métodos getters para los atributos de la vacuna
    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }
}
