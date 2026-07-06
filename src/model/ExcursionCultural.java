package model;

// Subclase de ServicioTuristico que representa una excursión cultural.
// Hereda nombre y duracionHoras, y agrega su propio atributo: lugarHistorico.
public class ExcursionCultural extends ServicioTuristico {

    // Atributo propio de esta subclase.
    private String lugarHistorico;

    // Constructor: reutiliza el constructor de la superclase con super(...)
    // y luego inicializa el atributo propio.
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // Getter
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    // Setter
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    // toString(): sobrescribe el método de la superclase para mostrar
    // también el atributo propio de esta subclase.
    @Override
    public String toString() {
        return "ExcursionCultural{" +
                super.toString() +
                ", lugarHistorico='" + lugarHistorico + '\'' +
                '}';
    }
}