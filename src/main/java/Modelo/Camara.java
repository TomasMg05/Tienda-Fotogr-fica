/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Camara {
    private String marca;
    private String modelo;
    private boolean soporteFlash;
    
    public Camara(String marca, String modelo, boolean soporteFlash) {
        this.marca = marca;
        this.modelo = modelo;
        this.soporteFlash = soporteFlash;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isSoporteFlash() {
        return soporteFlash;
    }
}

