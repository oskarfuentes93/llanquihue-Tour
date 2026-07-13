package data;

import model.ServicioTuristico;
import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

import java.util.ArrayList;
import java.util.List;

// Clase encargada de gestionar los servicios turísticos de la agencia.
// Ahora maneja una colección polimórfica de tipo List<ServicioTuristico>,
// que puede contener objetos de cualquier subclase (RutaGastronomica,
// PaseoLacustre, ExcursionCultural) tratados todos como ServicioTuristico.
public class GestorServicios {

    // Colección polimórfica: declarada con el tipo de la superclase,
    // pero puede contener instancias de cualquier subclase.
    private List<ServicioTuristico> servicios;

    // Constructor: inicializa la lista y la carga con datos de ejemplo.
    public GestorServicios() {
        servicios = new ArrayList<>();
        cargarServiciosDePrueba();
    }

    // Carga en la lista al menos cinco objetos combinando instancias
    // de las distintas subclases de ServicioTuristico.
    private void cargarServiciosDePrueba() {
        servicios.add(new RutaGastronomica("Ruta de los Quesos", 4, 5));
        servicios.add(new RutaGastronomica("Ruta del Salmón Ahumado", 3, 4));
        servicios.add(new PaseoLacustre("Paseo Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Paseo Lago Todos los Santos", 3, "Lancha"));
        servicios.add(new ExcursionCultural("Recorrido Colonial Frutillar", 3, "Museo Colonial Alemán"));
        servicios.add(new ExcursionCultural("Ruta Histórica Puerto Varas", 2, "Iglesia Sagrado Corazón"));
    }

    // Retorna la lista de servicios para que Main u otra clase pueda recorrerla.
    public List<ServicioTuristico> getServicios() {
        return servicios;
    }

    // Recorre la colección y llama a mostrarInformacion() desde la referencia
    // de tipo ServicioTuristico. Cada objeto ejecuta su propia versión
    // sobrescrita del método (polimorfismo).
    public void mostrarTodosLosServicios() {
        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}