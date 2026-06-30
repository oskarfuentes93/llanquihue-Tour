# LlanquihueTourApp

## Descripción
Aplicación en Java que gestiona los tours ofrecidos por la agencia Llanquihue Tour (Región de Los Lagos). El sistema lee información de tours desde un archivo de texto, organiza los datos en colecciones dinámicas y permite filtrar resultados según el precio. Además, incorpora una jerarquía de clases con herencia simple para modelar distintos tipos de servicios turísticos.

## Estructura de paquetes

LlanquihueTourApp/
├── resources/
│   └── tours.txt              # Datos de los tours (nombre;comuna;precio;guia;telefono)
└── src/
├── model/
│   ├── Tour.java              # Clase que representa un tour
│   ├── Guia.java              # Clase que representa un guía turístico
│   ├── ServicioTuristico.java # Superclase: servicio turístico genérico
│   ├── RutaGastronomica.java  # Subclase: ruta gastronómica
│   ├── PaseoLacustre.java     # Subclase: paseo lacustre
│   └── ExcursionCultural.java # Subclase: excursión cultural
├── util/
│   └── Validador.java     # Métodos de validación reutilizables
├── service/
│   └── GestorDatos.java   # Lee tours.txt y crea objetos Tour
├── data/
│   └── GestorServicios.java # Crea instancias de prueba de los servicios turísticos
└── app/
└── Main.java          # Clase principal: muestra y filtra los tours, y muestra los servicios turísticos

## Clases implementadas

### Semanas anteriores
- **Tour** (model): representa un tour con nombre, comuna, precio y guía asignado.
- **Guia** (model): representa un guía turístico con nombre y teléfono. Se relaciona con Tour mediante composición.
- **Validador** (util): clase utilitaria con métodos estáticos para validar textos y precios.
- **GestorDatos** (service): lee el archivo tours.txt y retorna una lista de objetos Tour.

### Semana 6: Jerarquías de clases con herencia simple
- **ServicioTuristico** (model): superclase que define los atributos comunes `nombre` y `duracionHoras`, junto con sus getters, setters y `toString()`.
- **RutaGastronomica** (model): subclase de ServicioTuristico, agrega el atributo `numeroDeParadas`. Usa `super(...)` en su constructor y sobrescribe `toString()`.
- **PaseoLacustre** (model): subclase de ServicioTuristico, agrega el atributo `tipoEmbarcacion`. Usa `super(...)` en su constructor y sobrescribe `toString()`.
- **ExcursionCultural** (model): subclase de ServicioTuristico, agrega el atributo `lugarHistorico`. Usa `super(...)` en su constructor y sobrescribe `toString()`.
- **GestorServicios** (data): crea dos instancias de prueba de cada subclase y las muestra por consola.
- **Main** (app): ejecuta el programa, muestra todos los tours, filtra por precio, y muestra los servicios turísticos de la jerarquía de herencia.

## Cómo ejecutar
1. Abrir el proyecto en NetBeans o IntelliJ IDEA con JDK 21.
2. Ejecutar la clase `Main` ubicada en `src/app/Main.java`.
3. La consola mostrará:
   - El listado completo de tours con su guía asignado.
   - Los tours con precio mayor a 5000.
   - Las instancias de RutaGastronomica, PaseoLacustre y ExcursionCultural, mostrando su información mediante `toString()`.