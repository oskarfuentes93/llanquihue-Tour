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

# Semana 8: Interfaces, polimorfismo con instanceof y GUI

En esta etapa se amplió el sistema para gestionar entidades operativas de la
agencia (guías, vehículos y colaboradores externos) mediante una interfaz común,
herencia, una colección polimórfica con validación de tipos por `instanceof`, y
una interfaz gráfica básica construida con `JOptionPane`.

## Interfaz y clases agregadas
- **Registrable** (model): interfaz que define el contrato común `mostrarResumen()`,
  implementado por todas las entidades gestionables.
- **RecursoAgencia** (model): superclase común que agrupa los atributos y el
  comportamiento compartido (`nombre`, `identificador`) de las entidades operativas.
- **GuiaTuristico** (model): subclase de `RecursoAgencia` que implementa `Registrable`.
  Atributo propio: `idioma`.
- **Vehiculo** (model): subclase de `RecursoAgencia` que implementa `Registrable`.
  Atributo propio: `capacidad`.
- **ColaboradorExterno** (model): subclase de `RecursoAgencia` que implementa
  `Registrable`. Atributo propio: `servicio`.
- **GestorEntidades** (data): almacena las entidades en una colección genérica
  `ArrayList<Registrable>`, la recorre con un bucle `for-each` y usa el operador
  `instanceof` para identificar el tipo específico de cada objeto y aplicar lógica
  diferenciada.
- **VentanaPrincipal** (ui): interfaz gráfica basada en `JOptionPane` que permite
  ingresar guías turísticos y vehículos, y visualizar el resumen de todas las
  entidades registradas.

## Conceptos aplicados
- **Interfaz**: `Registrable` como contrato común implementado por tres clases.
- **Herencia**: superclase `RecursoAgencia` con tres subclases diferenciadas.
- **Polimorfismo**: la colección `ArrayList<Registrable>` trata todas las entidades
  de forma uniforme; cada objeto ejecuta su propia versión de `mostrarResumen()`.
- **instanceof**: identificación del tipo concreto de cada objeto en tiempo de
  ejecución dentro de la colección.
- **GUI**: ingreso y visualización de entidades mediante cuadros de diálogo.

## Cómo ejecutar (Semana 8)
1. Abrir el proyecto en NetBeans (Apache NetBeans IDE 25) con JDK 21 (Eclipse Adoptium).
2. Clic derecho sobre `Main.java` (paquete `app`) → **Run File**, o usar el botón ▶ verde.
3. El programa mostrará por consola los servicios turísticos y las entidades de prueba
   con su tipo detectado mediante `instanceof`.
4. A continuación se abrirá la interfaz gráfica (`JOptionPane`) con un menú que permite:
   - Ingresar un guía turístico.
   - Ingresar un vehículo.
   - Mostrar todas las entidades registradas.
   - Salir.
