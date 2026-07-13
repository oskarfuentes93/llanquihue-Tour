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


#Semana 7 


# Llanquihue Tour - Sistema de Gestión de Servicios Turísticos

Proyecto académico para la asignatura Desarrollo Orientado a Objetos I (PRY2202).
Simula un sistema de gestión de servicios turísticos para la agencia ficticia
Llanquihue Tour, en la región de Los Lagos, Chile.

## Estructura del proyecto

- `model/`: clases del dominio (ServicioTuristico y sus subclases).
- `data/`: clases de gestión y acceso a datos (GestorServicios).
- `service/`: lógica de negocio adicional.
- `util/`: utilidades (validaciones).
- `app/`: clase principal (Main).

## Semana 7: Polimorfismo y colecciones genéricas

Se extendió la jerarquía de clases para aplicar polimorfismo:

- Se agregó el método `mostrarInformacion()` en la superclase `ServicioTuristico`,
  sobrescrito con `@Override` en cada subclase (`RutaGastronomica`, `PaseoLacustre`,
  `ExcursionCultural`) para mostrar información específica de cada tipo de servicio.
- Se implementó una colección polimórfica `List<ServicioTuristico>` en
  `GestorServicios`, cargada con 6 objetos combinando las tres subclases.
- Se recorre la colección con un bucle `for-each`, invocando `mostrarInformacion()`
  desde la referencia de tipo `ServicioTuristico`, ejecutando en tiempo de
  ejecución la versión sobrescrita correspondiente a cada objeto.

## Cómo compilar y ejecutar

1. Abrir el proyecto en NetBeans (Apache NetBeans IDE 25).
2. Verificar que el JDK configurado sea JDK 21 (Eclipse Adoptium).
3. Clic derecho sobre `Main.java` (paquete `app`) → **Run File**,
   o usar el botón ▶ verde de la barra superior con `Main.java` como archivo activo.
4. La consola mostrará los 6 servicios turísticos con su información específica,
   aplicando polimorfismo.