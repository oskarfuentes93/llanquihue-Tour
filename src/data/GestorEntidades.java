package data;

import java.util.ArrayList;
import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;

// Clase encargada de almacenar y gestionar las entidades del sistema
// mediante una coleccion polimorfica basada en la interfaz Registrable.
public class GestorEntidades {

    // Coleccion generica: acepta cualquier objeto que implemente Registrable.
    private ArrayList<Registrable> entidades;

    // Constructor: inicializa la coleccion vacia.
    public GestorEntidades() {
        this.entidades = new ArrayList<>();
    }

    // Agrega una entidad a la coleccion.
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    // Devuelve la coleccion completa (util para la GUI del Paso 4).
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }

    // Recorre la coleccion, muestra el resumen de cada entidad
    // y usa instanceof para identificar el tipo especifico de cada objeto.
    public void mostrarEntidades() {
        for (Registrable entidad : entidades) {

            // Muestra el resumen implementado por cada clase (polimorfismo).
            System.out.println(entidad.mostrarResumen());

            // Identifica el tipo concreto en tiempo de ejecucion
            // y aplica una logica diferenciada segun corresponda.
            if (entidad instanceof GuiaTuristico) {
                System.out.println("   -> Tipo detectado: Guia Turistico");
            } else if (entidad instanceof Vehiculo) {
                System.out.println("   -> Tipo detectado: Vehiculo");
            } else if (entidad instanceof ColaboradorExterno) {
                System.out.println("   -> Tipo detectado: Colaborador Externo");
            }

            System.out.println("--------------------------------------");
        }
    }

    // Metodo de prueba: crea entidades de ejemplo y las muestra.
    public void cargarEntidadesDePrueba() {
        agregarEntidad(new GuiaTuristico("Camila Soto", "G-001", "Espanol"));
        agregarEntidad(new Vehiculo("Van Mercedes", "PATENTE-XY12", 15));
        agregarEntidad(new ColaboradorExterno("Foto Sur", "76.543.210-K", "Fotografia"));

        mostrarEntidades();
    }
}