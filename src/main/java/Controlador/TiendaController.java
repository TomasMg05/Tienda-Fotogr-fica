/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Camara;
import Modelo.Cliente;
import Vista.TiendaView;
import java.util.ArrayList;

public class TiendaController {
    private ArrayList<Camara> camaras;
    private ArrayList<Cliente> clientes;
    private TiendaView view;

    public TiendaController(TiendaView view) {
        this.camaras = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.view = view;
        camaras.add(new Camara("Canon", "EOS R", true));
        camaras.add(new Camara("Nikon", "D850", false));
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    alquilarCamara();
                    break;
                case 2:
                    devolverCamara();
                    break;
                case 3:
                    view.mostrarMensaje("Gracias por utilizar la tienda de cámaras.");
                    break;
                default:
                    view.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 3);
    }

    public void alquilarCamara() {
        String nombreCliente = view.solicitarNombreCliente();
        Cliente cliente = buscarCliente(nombreCliente);
        if (cliente == null) {
            cliente = new Cliente(nombreCliente, "");
            clientes.add(cliente);
        }

        if (cliente.getCamaraAlquilada() != null) {
            view.mostrarMensaje("Ya tienes una cámara alquilada.");
        } else {
            String modeloCamara = view.solicitarModeloCamara();
            Camara camara = buscarCamara(modeloCamara);
            if (camara != null) {
                cliente.alquilarCamara(camara);
                view.mostrarMensaje("Cámara alquilada exitosamente.");
            } else {
                view.mostrarMensaje("Modelo de cámara no encontrado.");
            }
        }
    }

    public void devolverCamara() {
        String nombreCliente = view.solicitarNombreCliente();
        Cliente cliente = buscarCliente(nombreCliente);
        if (cliente != null && cliente.getCamaraAlquilada() != null) {
            cliente.devolverCamara();
            view.mostrarMensaje("Cámara devuelta exitosamente.");
        } else {
            view.mostrarMensaje("No tienes ninguna cámara para devolver.");
        }
    }

    private Cliente buscarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    private Camara buscarCamara(String modelo) {
        for (Camara camara : camaras) {
            if (camara.getModelo().equalsIgnoreCase(modelo)) {
                return camara;
            }
        }
        return null;
    }
}
