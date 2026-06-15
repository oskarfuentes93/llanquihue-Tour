# LlanquihueTourApp

## Descripción
Aplicación en Java que gestiona los tours ofrecidos por la agencia Llanquihue Tour (Región de Los Lagos). El sistema lee información de tours desde un archivo de texto, la organiza en una colección y permite filtrar resultados según el precio.

## Estructura de carpetas

LlanquihueTourApp/

├── resources/

│   └── tours.txt          # Datos de los tours (nombre;comuna;precio)

└── src/

├── model/

│   └── Tour.java       # Clase que representa un tour

├── data/

│   └── GestorDatos.java # Lee tours.txt y crea objetos Tour

└── ui/

└── Main.java        # Clase principal: muestra y filtra los tours

## Cómo ejecutar
1. Abrir el proyecto en IntelliJ IDEA con JDK 21.
2. Ejecutar la clase `Main` ubicada en `src/ui/Main.java`.
3. La consola mostrará:
    - El listado completo de tours.
    - El listado de tours con precio mayor a 5000.
