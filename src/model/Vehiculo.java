package model;

// Entidad que representa un vehiculo de la agencia.
// Hereda de RecursoAgencia e implementa el contrato Registrable.
public class Vehiculo extends RecursoAgencia implements Registrable {

    // Atributo propio de esta entidad.
    private int capacidad;

    public Vehiculo(String nombre, String identificador, int capacidad) {
        super(nombre, identificador);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String mostrarResumen() {
        return "Vehiculo: " + nombre
                + " | Patente: " + identificador
                + " | Capacidad: " + capacidad + " pasajeros";
    }
}