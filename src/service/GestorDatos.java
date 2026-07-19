package service;

import model.Guia;
import model.Tour;
import util.Validador;
import util.ValidacionException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Clase encargada de leer el archivo tours.txt y transformar
// cada linea de texto en un objeto Tour, guardandolos en una lista.
public class GestorDatos {

    // Metodo que lee el archivo y devuelve una lista de objetos Tour.
    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        // ArrayList donde se almacenaran todos los objetos Tour creados.
        ArrayList<Tour> tours = new ArrayList<>();

        // try-with-resources: abre el archivo y lo cierra automaticamente.
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            // Lee linea por linea hasta que no queden mas.
            while ((linea = lector.readLine()) != null) {

                // Separa cada linea usando ";" como separador.
                // Ejemplo: "Isla Huar;Calbuco;1200;Carlos Perez;912345678"
                // -> ["Isla Huar", "Calbuco", "1200", "Carlos Perez", "912345678"]
                String[] datos = linea.split(";");

                // try-catch por linea: si esta fila trae un dato invalido,
                // se captura la excepcion, se avisa y se continua con la siguiente.
                // Asi un error en una linea no detiene la carga completa.
                try {
                    String nombre = datos[0];
                    String comuna = datos[1];
                    int precio = Integer.parseInt(datos[2]);
                    String nombreGuia = datos[3];
                    String telefonoGuia = datos[4];

                    // Valida el nombre con el metodo booleano tradicional.
                    if (!Validador.esTextoValido(nombre)) {
                        System.out.println("Linea omitida (nombre vacio): " + linea);
                        continue;
                    }

                    // Valida el precio con la excepcion personalizada.
                    // Si el precio es <= 0, validarPrecio lanza ValidacionException
                    // y la ejecucion salta directamente al catch de abajo.
                    Validador.validarPrecio(precio);

                    // Si llego aca, los datos son validos: se construyen los objetos.
                    // Se crea el objeto Guia con sus datos.
                    Guia guia = new Guia(nombreGuia, telefonoGuia);

                    // Se crea el objeto Tour incluyendo el Guia (composicion).
                    Tour tour = new Tour(nombre, comuna, precio, guia);

                    // Se agrega el tour a la lista.
                    tours.add(tour);

                } catch (ValidacionException e) {
                    // Captura la excepcion personalizada lanzada por validarPrecio.
                    // getMessage() recupera el texto que se paso al crear la excepcion.
                    System.out.println("Linea omitida (precio invalido): " + e.getMessage());
                } catch (NumberFormatException e) {
                    // Captura el error si el precio del .txt no es un numero valido.
                    System.out.println("Linea omitida (precio no numerico): " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}