## Ejercicio 7.21 Conjuntos
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

Un conjunto es una estructura dinámica de datos como la lista, con dos diferencias:
           
           En primer lugar, en una lista puede haber elementos repetidos, mientras que en un conjunto, no.
           Además, en una lista el orden de inserción de los elementos pueden ser relevante y de debemos
           tenerlo en cuenta, mientras que en un conjunto solo interesa si un elemento pertenece o no al 
           conjunto y no el lugar que ocupa.
           
Se pide implementar la clase conjunto utilizando una lista para almacenar numeros de tipo `Integer`.

## Estructura y funcionamiento

> **ATRIBUTOS**

> `Integer [] con`: representa a la tabla donde se van a almacenar los elementos de los conjuntos.

> **METODOS**
>
> `int numeroElementos()`: devuelve el numero de elementos del conjunto
>
> `boolean insertar(Integer nuevo): añade al conjunto `elemento`.
>
> `boolean insertar(Conjunto otroConjunto): añade al conjunto los elementos del conjunto `otro conjunto`.
>
> `boolean eliminarElemento(Integer elemento)`: en caso de pertenecer al conjunto, elimina `elemento`. 
>
> `boolean eliminarConjunto(Conjunto otroConjunto)`: elimina del conjunto invocante los elementos del conjunto que se pasa como parámetro. 
>
> `boolean pertenece(Integer elemento)` : indica si el elemento que se le pasa como parametro pertenece o no al conjunto.
>
> `void muestra()` : muestra el conjunto por consola.

## Dependencias

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)



