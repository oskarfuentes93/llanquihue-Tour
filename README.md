# LlanquihueTourApp

## Descripción
Aplicación en Java que gestiona los tours ofrecidos por la agencia Llanquihue Tour (Región de Los Lagos). El sistema lee información de tours desde un archivo de texto, organiza los datos en colecciones dinámicas y permite filtrar resultados según el precio.

## Estructura de paquetes

LlanquihueTourApp/

├── resources/

│   └── tours.txt         # Datos de los tours (nombre;comuna;precio;guia;telefono)

└── src/

├── model/

│   ├── Tour.java     # Clase que representa un tour

│   └── Guia.java     # Clase que representa un guía turístico

├── util/

│   └── Validador.java # Métodos de validación reutilizables

├── service/

│   └── GestorDatos.java # Lee tours.txt y crea objetos Tour

└── app/

└── Main.java     # Clase principal: muestra y filtra los tours

## Clases implementadas
- **Tour** (model): representa un tour con nombre, comuna, precio y guía asignado.
- **Guia** (model): representa un guía turístico con nombre y teléfono. Se relaciona con Tour mediante composición.
- **Validador** (util): clase utilitaria con métodos estáticos para validar textos y precios.
- **GestorDatos** (service): lee el archivo tours.txt y retorna una lista de objetos Tour.
- **Main** (app): ejecuta el programa, muestra todos los tours y filtra por precio.

## Cómo ejecutar
1. Abrir el proyecto en IntelliJ IDEA con JDK 21.
2. Ejecutar la clase `Main` ubicada en `src/app/Main.java`.
3. La consola mostrará:
   - El listado completo de tours con su guía asignado.
   - Los tours con precio mayor a 5000.