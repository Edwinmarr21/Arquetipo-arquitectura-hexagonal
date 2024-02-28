# Modelo de dominio
En esta capa se definen las clases que representan las reglas de negocio sin framework. Solo código Java.

El dominio no conoce nada de persistencia, es decir, de bases de datos o sistemas de archivos, etc. Si se necesitan persistir datos, en la persistencia se hacen las conversiones necesarias entre entidades de dominio y entidades de persistencia. Esto permite separar las responsabilidades y desacoplar el dominio de la persistencia. 

El domino solo debe conocer una abstracción que permita persistir datos, no cómo ni donde los persiste

***Nota: Lombok permite evitar el código espagueti pero siendo riguroso con las reglas de dependencias, no haría parte del dominio. Siendo rigurosos, no debería usarse en el dominio. Sin embargo, es decision de cada desarrollador o el arquitecto si se usa o no.***

## Entidades

Las entidades modelan el negocio en mínimas unidades. Por ejemplo: Persona, Estudiante, Profesor, Nota, etc...

## Data Transfer Objects (DTOs)

Los DTOs permiten transportar los campos o atributos relevantes para quien consume el servicio. Por ejemplo, supóngase que de una consulta solo requiero saber el nombre, número de celular y la nota final del estudiante. Como usuario no necesito ver toda la información de la entidad Estudiante y Notas. 

Por lo tanto, se define una nueva clase que solo contenga dichos valores requeridos.

## Enums (Value objects)

Los enums permiten agrupar un conjunto de valores relacionados de los que puede tomar una variable. Por ejemplo, el seniority de un desarrollador, supóngase que el negocio solo contempla "Trainee, Junior, Advanced, Senior, Master". En este caso, los valores se mantendrán constantes y se evitan valores diferentes a ellos.
## Constants

Las constantes son valores que no van a cambiar por ningún motivo en el código, y son vitales para escribir un código límpio y reutilizable.

***NOTA IMPORTANTE: eliminar todo lo relacionado al ejemplo***