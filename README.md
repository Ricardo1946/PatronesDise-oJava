
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





## 🧑 Autor
- David Ricardo Gracia
- Backend Developer | Java & Spring Boot
- 📧 ricardog1946@gmail.com