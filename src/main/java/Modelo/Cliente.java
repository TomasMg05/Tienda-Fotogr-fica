/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Cliente {
    private String nombre;
    private String direccion;
    private Camara camaraAlquilada;
    private int diasAlquiler;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.camaraAlquilada = null;
        this.diasAlquiler = 0;
    }

    public boolean alquilarCamara(Camara camara) {
        if (this.camaraAlquilada == null) {
            this.camaraAlquilada = camara;
            this.diasAlquiler = 7;
            return true;
        }
        return false;
    }

    public void devolverCamara() {
        this.camaraAlquilada = null;
        this.diasAlquiler = 0;
    }

    public boolean tieneRetraso() {
        return diasAlquiler < 0;
    }

    public void pasarDia() {
        if (diasAlquiler > 0) {
            diasAlquiler--;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Camara getCamaraAlquilada() {
        return camaraAlquilada;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }
}
