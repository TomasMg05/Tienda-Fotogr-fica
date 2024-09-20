/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Pelicula {
    private String marca;
    private String nombre;
    private int sensibilidadISO;
    private String formato;

    public Pelicula(String marca, String nombre, int sensibilidadISO, String formato) {
        this.marca = marca;
        this.nombre = nombre;
        this.sensibilidadISO = sensibilidadISO;
        this.formato = formato;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSensibilidadISO() {
        return sensibilidadISO;
    }

    public String getFormato() {
        return formato;
    }
}
