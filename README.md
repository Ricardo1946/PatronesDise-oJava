
## 📘 Documentación de los patrones de Diseño

### 🚀 1. **Creaciones**: 
Proporcionan varios mecanismos de creacion de objetos que incrementan la flexibilidad y la reutilizacion del codigo existente.


 ### **Abstract Factory**:
- Proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas.Es util cuando el sistema debe ser independiente de como se crea, componen y representan sus objetos.

![AbstracFactory.jpeg](..%2F..%2F..%2FDownloads%2FAbstracFactory.jpeg)

### - Interfaz AnimalFactory

```bash
Animal createAnimal(String type);
```
No se sabe que animal se va a crear ni como se va a crear. Solo dice: "Quien me implemente debe saber crear animales".

### Clases que implementan AnimalFactory

- LandAnimalFactory: Implementa createAnimal() para devolver animales terrestres como Dog, Duck.
- SeaAnimalFactory: Implementa createAnimal() para devolver animales marinos como Shark, Octopus.

Ambas clases están conectadas a AnimalFactory porque la implementan. Esta relación es clave en el patrón Abstract Factory.

### **Method Factory**:
Proporciona una interfaz para crear objetos en uns superclase, pero permite que las superclases, pero permite que las subclases alteren el tipo de objetos que se crean.

1. El cleinte no sabe si se crea un **EmailNotification** o un **SMSNotification**.
2. Solo usa una fabrica abstracta (**NotificationFactory**) para pedir el objeto.
3. Cada **Fabrica concreta** decide que clase crear (**EmailNotificacion, SMSNotification**).


### **Method Factory**:
El patron Builder permite construir objetos complejos paso a paso. El patron permite producir distintos tipos y representaciones de un objeto utilizado el msimo codigo de contruccion.

- El codigo principal no dependa directamente de clases concretas.
- La aplicacion deba trabajar con diferentes tipos de objetos, pero no modifica el codigo principal cada vez que cambie tl tipo de objeto.


### **Builder**:
El **Builder** es ideal cuando quieres crear objetos complejos (con muchos parametros) de forma controlada y legible, especialemente si: 
- El constructor tendria demasiados parametros.
- Algunos valores son opciones.
- Quieres tener multiples combinaciones de configuracion sin multiples constructores (loque rompe el principio de legibilidad).


### **Singleton**:
 El patron **Singleton** asegura que una clase tenga una unica instancia y proporciona un punto de acceso global a ella.
-  Es como un "**UNICO PRESIDENTE**" en tu sistema: solo pueder hbaer uno, y no todos deben acudir a el si necesitan su autoridad.

- 🧠 Se usa cuando:
  - Conexion a una base de datos.
  - -Logger global
  - Configuraciones compartidas
  - Gestores de cache
  - Acceso a recursos unicos del sistema. 

### **Prototype**:
El patron **Prototype** permite copiar objetos existentes sin depender de sus clases especificas, lo cual es util cuando la creacion de un objeto es costosa o compleja.

- Es como usar "Duplicidad" en un editor grafico. Si ya tienes un boton estilizado y con logica, simplemente lo clonas y lo modificas un poco sin tener que crear uno nuevo desde cero. 

- 🧠 Cuando se usa: 
-  Cuando los objetos tiene muchos atributos o estructuras anidadas complejas.
- Cuando la creacion es costosa(por ejemplo: cargar de base de datos, procesar recuerso, etc.).
- Cuando se necesita copiar objetos en tiempo de ejecuccion, sn conocer su tipo exacto. 


## 🧑 Autor
- David Ricardo Gracia
- Backend Developer | Java & Spring Boot
- 📧 ricardog1946@gmail.com