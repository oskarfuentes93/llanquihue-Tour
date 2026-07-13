package model;

// Subclase de ServicioTuristico que representa una ruta gastronómica.
// Hereda nombre y duracionHoras, y agrega su propio atributo: numeroDeParadas.
public class RutaGastronomica extends ServicioTuristico {
    // Atributo propio de esta subclase.
    private int numeroDeParadas;

    // Constructor: reutiliza el constructor de la superclase con super(...)
    // y luego inicializa el atributo propio.
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // Getter
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    // Setter
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    // mostrarInformacion(): sobrescribe el método de la superclase para mostrar
    // también el atributo propio de esta subclase (numeroDeParadas).
    @Override
    public void mostrarInformacion() {
        System.out.println("Ruta Gastronómica: " + nombre + " (" + duracionHoras + " horas) - " 
                + numeroDeParadas + " paradas");
    }

    // toString(): sobrescribe el método de la superclase para mostrar
    // también el atributo propio de esta subclase.
    @Override
    public String toString() {
        return "RutaGastronomica{" +
                super.toString() +
                ", numeroDeParadas=" + numeroDeParadas +
                '}';
    }
}