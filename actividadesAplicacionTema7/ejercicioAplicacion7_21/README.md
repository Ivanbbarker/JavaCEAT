## Ejercicio 7.21 Conjuntos
[Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

Un conjunto es una estructura dinámica de datos como la lista, con dos diferencias:
           
           En primer lugar, en una lista puede haber elementos repetidos, mientras que en un conjunto, no.
           Además, en una lista el orden de inserción de los elementos pueden ser relevante y de debemos
           tenerlo en cuenta, mientras que en un conjunto solo interesa si un elemento pertenece o no al 
           conjunto y no el lugar que ocupa.
           
Se pide implementar la clase conjunto utilizando una lista para almacenar numeros de tipo `Integer`.

## Estructura y funcionamiento

> **ATRIBUTOS**

> `public int paginaLeida` : representa las paginas leidas que llevamos.
> `public int paginaMax` : representa las paginas totales del libro.
> `public int PaginasRestantes` : representan las paginas restantes que quedan en el libro.

> **METODOS**

> `public int incrementaPagina()` : su funcionalidad consiste en el incremento de las paginas que llevamos leidas de nuestro libro.

> `public int gestUltimaPagina()` : su funcionalidad es simplemente devolver la ultima pagina que hemos leido.

> `public int setPrincipio()` : funionalidad que hace volver a empezar el libro desde el principio, volviendo a 0, el atributo paginaLeida. Y volviendo al total de paginas el atributo PaginasRestantes.

> `void mostrarInformacion()` : metodo que devuelve informacion que puede ser relevante a la hora de las comprobaciones del programa.

## Dependencias

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)



