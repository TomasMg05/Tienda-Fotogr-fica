/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Alquiler {
    private Cliente cliente;
    private Camara camara;
    private int diasRestantes;

    public Alquiler(Cliente cliente, Camara camara) {
        this.cliente = cliente;
        this.camara = camara;
        this.diasRestantes = 7;
    }

    public void registrarDia() {
        if (diasRestantes > 0) {
            diasRestantes--;
        } else {
            System.out.println("Retraso en la devolución.");
        }
    }

    public boolean estaEnRetraso() {
        return diasRestantes < 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Camara getCamara() {
        return camara;
    }

    public int getDiasRestantes() {
        return diasRestantes;
    }
}
