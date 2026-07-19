package app;

import data.GestorServicios;
import data.GestorEntidades;
import service.GestorDatos;
import model.Tour;
import ui.VentanaPrincipal;
import java.util.ArrayList;

// Clase principal: punto de entrada del programa.
// Carga los tours desde archivo, muestra los servicios turisticos por consola,
// las entidades operativas con instanceof, y finalmente lanza la interfaz grafica (GUI).
public class Main {
    public static void main(String[] args) {

        // --- Tours cargados desde archivo .txt (lectura de datos externos) ---
        System.out.println("=================================================");
        System.out.println("          TOURS CARGADOS DESDE ARCHIVO");
        System.out.println("=================================================\n");

        // Se crea el gestor de datos y se le pide leer el archivo tours.txt.
        // La ruta es relativa a la carpeta del proyecto (carpeta resources).
        GestorDatos gestorDatos = new GestorDatos();
        ArrayList<Tour> tours = gestorDatos.cargarTours("resources/tours.txt");

        // Se recorre la lista de tours y se muestra cada uno.
        // Si alguna linea del archivo tuvo un precio invalido, no aparece aca:
        // fue omitida por la ValidacionException dentro de GestorDatos.
        for (Tour tour : tours) {
            System.out.println(tour);
        }

        // --- Servicios turisticos (jerarquia de semanas anteriores) ---
        System.out.println("\n=================================================");
        System.out.println("             SERVICIOS TURISTICOS");
        System.out.println("=================================================\n");

        GestorServicios gestor = new GestorServicios();
        gestor.mostrarTodosLosServicios();

        // Separador visual en consola entre una parte y la otra.
        System.out.println("\n=================================================");
        System.out.println("          ENTIDADES OPERATIVAS DE LA AGENCIA");
        System.out.println("=================================================\n");

        // --- Entidades operativas (Registrable + instanceof, semana actual) ---
        GestorEntidades gestorEntidades = new GestorEntidades();
        gestorEntidades.cargarEntidadesDePrueba();

        // --- Interfaz grafica (GUI con JOptionPane) ---
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.iniciar();
    }
}