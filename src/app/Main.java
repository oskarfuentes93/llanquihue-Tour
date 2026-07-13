package app;

import data.GestorServicios;
import data.GestorEntidades;
import ui.VentanaPrincipal;

// Clase principal: punto de entrada del programa.
// Muestra los servicios turisticos por consola, las entidades operativas
// con instanceof, y finalmente lanza la interfaz grafica (GUI).
public class Main {
    public static void main(String[] args) {

        // --- Servicios turisticos (jerarquia de semanas anteriores) ---
        GestorServicios gestor = new GestorServicios();
        gestor.mostrarTodosLosServicios();

        // Separador visual en consola entre una parte y la otra.
        System.out.println("\n==================================================");
        System.out.println("        ENTIDADES OPERATIVAS DE LA AGENCIA");
        System.out.println("==================================================\n");

        // --- Entidades operativas (Registrable + instanceof, semana actual) ---
        GestorEntidades gestorEntidades = new GestorEntidades();
        gestorEntidades.cargarEntidadesDePrueba();

        // --- Interfaz grafica (GUI con JOptionPane) ---
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.iniciar();
    }
}