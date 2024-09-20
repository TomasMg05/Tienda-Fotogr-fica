/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

public class TiendaView {
    private Scanner scanner;

    public TiendaView() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenuPrincipal() {
        System.out.println("1. Alquilar cámara");
        System.out.println("2. Devolver cámara");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String solicitarNombreCliente() {
        System.out.print("Ingrese su nombre: ");
        return scanner.next();
    }

    public String solicitarModeloCamara() {
        System.out.print("Ingrese el modelo de la cámara: ");
        return scanner.next();
    }
}
