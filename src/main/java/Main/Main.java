/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.TiendaController;
import Vista.TiendaView;

public class Main {
    public static void main(String[] args) {
        TiendaView view = new TiendaView();
        TiendaController controller = new TiendaController(view);
        controller.iniciar();
    }
}

