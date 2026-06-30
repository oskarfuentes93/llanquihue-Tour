package model;

// Subclase de ServicioTuristico que representa un paseo lacustre.
// Hereda nombre y duracionHoras, y agrega su propio atributo: tipoEmbarcacion.
public class PaseoLacustre extends ServicioTuristico {

    // Atributo propio de esta subclase.
    private String tipoEmbarcacion;

    // Constructor: reutiliza el constructor de la superclase con super(...)
    // y luego inicializa el atributo propio.
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    // Setter
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // toString(): sobrescribe el método de la superclase para mostrar
    // también el atributo propio de esta subclase.
    @Override
    public String toString() {
        return "PaseoLacustre{" +
                super.toString() +
                ", tipoEmbarcacion='" + tipoEmbarcacion + '\'' +
                '}';
    }
}