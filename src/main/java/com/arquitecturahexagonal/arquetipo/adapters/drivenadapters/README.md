# Adaptadores de salida
En esta capa se definen los adaptadores de los puertos que se exponen en el dominio. Es decir, se implementa una lógica para la abstracción de las interfaces.

En esta capa se resuelve el cómo y dónde se persiste la información, por ejemplo.

## Entidades ##

Las entidades de la persistencia representan un registro de una tabla de la base de datos. Aquí se incluyen las anotaciones correspondientes a la persistencia.

## Mappers ##

Los mappers son clases que permiten convertir entidades de dominio en entidades de persistencia y viceversa.

## Configuración ##

Esta subcapa permite configurar la conexión a la base de datos y todo lo necesario para hacer funcionar la persistencia.


