package model;

// Interfaz que define el contrato comun para las entidades gestionables del sistema.
// Cualquier clase que la implemente debe entregar su propio resumen.
public interface Registrable {

    // Metodo sin cuerpo: cada clase que implemente Registrable esta obligada a definirlo.
    String mostrarResumen();
}