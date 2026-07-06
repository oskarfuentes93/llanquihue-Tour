package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

// Clase encargada de crear instancias de prueba de los servicios turísticos.
// Su responsabilidad es generar datos de ejemplo para que Main los muestre.
public class GestorServicios {

    // Crea y muestra por consola dos instancias de cada subclase
    // de ServicioTuristico (RutaGastronomica, PaseoLacustre, ExcursionCultural).
    public void mostrarServiciosDePrueba() {

        // Dos instancias de RutaGastronomica
        RutaGastronomica ruta1 = new RutaGastronomica("Ruta de los Quesos", 4, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta del Salmón Ahumado", 3, 4);

        // Dos instancias de PaseoLacustre
        PaseoLacustre paseo1 = new PaseoLacustre("Paseo Lago Llanquihue", 2, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Paseo Lago Todos los Santos", 3, "Lancha");

        // Dos instancias de ExcursionCultural
        ExcursionCultural excursion1 = new ExcursionCultural("Recorrido Colonial Frutillar", 3, "Museo Colonial Alemán");
        ExcursionCultural excursion2 = new ExcursionCultural("Ruta Histórica Puerto Varas", 2, "Iglesia Sagrado Corazón");

        // Se muestran todos los objetos por consola usando su toString().
        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}