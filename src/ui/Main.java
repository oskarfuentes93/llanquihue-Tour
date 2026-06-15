package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

// Clase principal del programa. Aquí se ejecuta todo:
// se cargan los tours desde el archivo, se muestran,
// se filtran según una condición y se imprimen los resultados.
public class Main {

    public static void main(String[] args) {

        // Se crea un objeto GestorDatos para poder usar su método cargarTours().
        GestorDatos gestor = new GestorDatos();

        // Se llama al método que lee tours.txt y devuelve la lista de objetos Tour.
        // Ruta relativa: apunta a la carpeta resources dentro del proyecto.
        ArrayList<Tour> listaTours = gestor.cargarTours("resources/tours.txt");

        // --- 1. Recorrido: mostrar todos los tours cargados ---
        System.out.println("=== Listado completo de tours ===");
        for (Tour tour : listaTours) {
            System.out.println(tour);
        }

        // --- 2. Filtrado: mostrar solo los tours con precio mayor a 5000 ---
        System.out.println("\n=== Tours con precio mayor a 5000 ===");
        ArrayList<Tour> toursFiltrados = new ArrayList<>();

        for (Tour tour : listaTours) {
            // getPrecio() devuelve el precio del tour; se compara con 5000.
            if (tour.getPrecio() > 5000) {
                toursFiltrados.add(tour);
            }
        }

        // --- 3. Imprimir los resultados filtrados ---
        for (Tour tour : toursFiltrados) {
            System.out.println(tour);
        }
    }
}