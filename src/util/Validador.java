package util;

// Clase utilitaria con metodos de validacion reutilizables.
// Su funcion es verificar que los datos sean correctos antes de usarlos.
public class Validador {

    // Verifica que un texto no este vacio ni sea nulo.
    // Retorna true si el texto es valido, false si esta vacio o es nulo.
    public static boolean esTextoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    // Verifica que un precio sea un numero positivo mayor a cero.
    // Retorna true si el precio es valido, false si es cero o negativo.
    public static boolean esPrecioValido(int precio) {
        return precio > 0;
    }

    // Valida un precio y, si es invalido, LANZA una ValidacionException.
    // A diferencia de esPrecioValido (que solo retorna true/false),
    // este metodo interrumpe el flujo con una excepcion cuando el dato falla.
    // La palabra "throws ValidacionException" avisa que este metodo puede lanzarla,
    // por lo que quien lo llame esta obligado a manejarla con try-catch.
    public static void validarPrecio(int precio) throws ValidacionException {
        if (precio <= 0) {
            // throw crea y lanza el objeto excepcion con un mensaje explicativo.
            // Ese mensaje se podra leer luego con getMessage() en el catch.
            throw new ValidacionException("El precio debe ser mayor a cero. Valor recibido: " + precio);
        }
    }
}