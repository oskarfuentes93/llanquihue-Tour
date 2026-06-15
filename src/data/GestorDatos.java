package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Clase encargada de leer el archivo tours.txt y transformar
// cada línea de texto en un objeto Tour, guardándolos en una lista.
public class GestorDatos {

    // Método que lee el archivo y devuelve una lista de objetos Tour.
    // Recibe como parámetro la ruta del archivo a leer.
    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        // ArrayList donde se almacenarán todos los objetos Tour creados.
        ArrayList<Tour> tours = new ArrayList<>();

        // try-with-resources: abre el archivo y lo cierra automáticamente
        // al terminar, aunque ocurra un error.
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            // readLine() devuelve una línea del archivo, o null si ya no hay más.
            // El ciclo se repite mientras existan líneas por leer.
            while ((linea = lector.readLine()) != null) {

                // split(";") separa el texto de la línea usando ";" como separador
                // y devuelve un arreglo de Strings con cada dato por separado.
                // Ejemplo: "Isla Huar;Calbuco;1200" -> ["Isla Huar", "Calbuco", "1200"]
                String[] datos = linea.split(";");

                // datos[0] = nombre, datos[1] = comuna, datos[2] = precio (como texto).
                String nombre = datos[0];
                String comuna = datos[1];

                // Integer.parseInt convierte el texto "1200" en el número 1200.
                int precio = Integer.parseInt(datos[2]);

                // Se crea un nuevo objeto Tour con los datos leídos.
                Tour tour = new Tour(nombre, comuna, precio);

                // Se agrega el objeto a la lista.
                tours.add(tour);
            }

        } catch (IOException e) {
            // Si ocurre un error al leer el archivo (ej: no existe la ruta),
            // se muestra un mensaje en consola.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Se devuelve la lista completa con todos los tours creados.
        return tours;
    }
}