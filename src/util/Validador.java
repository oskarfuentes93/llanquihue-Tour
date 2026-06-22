package util;

// Clase utilitaria con métodos de validación reutilizables.
// Su función es verificar que los datos sean correctos antes de usarlos.
public class Validador {

    // Verifica que un texto no esté vacío ni sea nulo.
    // Retorna true si el texto es válido, false si está vacío o es nulo.
    public static boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    // Verifica que un precio sea un número positivo mayor a cero.
    // Retorna true si el precio es válido, false si es cero o negativo.
    public static boolean esPrecioValido(int precio) {
        return precio > 0;
    }
}