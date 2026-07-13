package ui;

import javax.swing.JOptionPane;
import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import model.Registrable;

// Interfaz grafica basica del sistema, construida con JOptionPane.
// Permite ingresar entidades (Guia Turistico y Vehiculo) y mostrar
// un resumen de todas las entidades registradas.
public class VentanaPrincipal {

    // Gestor que almacena las entidades creadas desde la GUI.
    private GestorEntidades gestor;

    // Constructor: inicializa el gestor de entidades.
    public VentanaPrincipal() {
        this.gestor = new GestorEntidades();
    }

    // Metodo que arranca la interfaz: muestra un menu en bucle
    // hasta que el usuario elija salir.
    public void iniciar() {

        boolean continuar = true;

        while (continuar) {

            // Menu principal: el usuario escribe una opcion.
            String opcion = JOptionPane.showInputDialog(
                    "=== Llanquihue Tour - Menu ===\n"
                    + "1. Ingresar Guia Turistico\n"
                    + "2. Ingresar Vehiculo\n"
                    + "3. Mostrar entidades registradas\n"
                    + "4. Salir\n\n"
                    + "Escribe el numero de la opcion:");

            // Si el usuario cierra el dialogo o presiona Cancelar, opcion es null: salimos.
            if (opcion == null) {
                continuar = false;
                continue;
            }

            // Segun la opcion elegida, ejecuta la accion correspondiente.
            switch (opcion) {
                case "1":
                    ingresarGuia();
                    break;
                case "2":
                    ingresarVehiculo();
                    break;
                case "3":
                    mostrarEntidades();
                    break;
                case "4":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida.");
            }
        }

        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }

    // Pide los datos de un Guia Turistico y lo agrega al gestor.
    private void ingresarGuia() {
        String nombre = JOptionPane.showInputDialog("Nombre del guia:");
        String id = JOptionPane.showInputDialog("Identificador (ID):");
        String idioma = JOptionPane.showInputDialog("Idioma:");

        GuiaTuristico guia = new GuiaTuristico(nombre, id, idioma);
        gestor.agregarEntidad(guia);

        JOptionPane.showMessageDialog(null, "Guia agregado:\n" + guia.mostrarResumen());
    }

    // Pide los datos de un Vehiculo y lo agrega al gestor.
    private void ingresarVehiculo() {
        String nombre = JOptionPane.showInputDialog("Nombre / modelo del vehiculo:");
        String patente = JOptionPane.showInputDialog("Patente:");
        String capacidadTexto = JOptionPane.showInputDialog("Capacidad (numero de pasajeros):");

        // Convierte el texto ingresado a numero entero.
        int capacidad = Integer.parseInt(capacidadTexto);

        Vehiculo vehiculo = new Vehiculo(nombre, patente, capacidad);
        gestor.agregarEntidad(vehiculo);

        JOptionPane.showMessageDialog(null, "Vehiculo agregado:\n" + vehiculo.mostrarResumen());
    }

    // Recorre las entidades registradas y las muestra en un cuadro de dialogo.
    private void mostrarEntidades() {

        // Acumula el texto de todas las entidades.
        String resumen = "=== Entidades registradas ===\n\n";

        // Recorre la coleccion del gestor usando el metodo getEntidades().
        for (Registrable entidad : gestor.getEntidades()) {
            resumen += entidad.mostrarResumen() + "\n";
        }

        // Si no hay entidades, avisa; si hay, las muestra.
        if (gestor.getEntidades().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay entidades registradas todavia.");
        } else {
            JOptionPane.showMessageDialog(null, resumen);
        }
    }
}