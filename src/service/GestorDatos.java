package service;

import model.Guia;
import model.Tour;
import util.Validador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Clase encargada de leer el archivo tours.txt y transformar
// cada línea de texto en un objeto Tour, guardándolos en una lista.
public class GestorDatos {

    // Método que lee el archivo y devuelve una lista de objetos Tour.
    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        // ArrayList donde se almacenarán todos los objetos Tour creados.
        ArrayList<Tour> tours = new ArrayList<>();

        // try-with-resources: abre el archivo y lo cierra automáticamente.
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            // Lee línea por línea hasta que no queden más.
            while ((linea = lector.readLine()) != null) {

                // Separa cada línea usando ";" como separador.
                // Ejemplo: "Isla Huar;Calbuco;1200;Carlos Pérez;912345678"
                // -> ["Isla Huar", "Calbuco", "1200", "Carlos Pérez", "912345678"]
                String[] datos = linea.split(";");

                String nombre = datos[0];
                String comuna = datos[1];
                int precio = Integer.parseInt(datos[2]);
                String nombreGuia = datos[3];
                String telefonoGuia = datos[4];

                // Se usa Validador para verificar que los datos sean correctos
                // antes de crear el objeto.
                if (Validador.esTextoValido(nombre) && Validador.esPrecioValido(precio)) {

                    // Se crea el objeto Guia con sus datos.
                    Guia guia = new Guia(nombreGuia, telefonoGuia);

                    // Se crea el objeto Tour incluyendo el Guia (composición).
                    Tour tour = new Tour(nombre, comuna, precio, guia);

                    // Se agrega el tour a la lista.
                    tours.add(tour);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}