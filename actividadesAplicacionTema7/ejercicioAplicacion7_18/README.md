## Ejercicio 7.11 MarcaPagina 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

Una cola es otra estructura dinamica como la pila. donde los elementos, en vez de apilarse y desapilarse, se encolan y desencolan. La diferencia con las pilas es que se desencola el primer elemento encolado, ya que así es como funcionan las colas del autobús o del cine. El primero que llega es el primero que sale de la cola (vamos a suponer que nadie se cuela). Por tanto, todos los elementos se encolan y desencolan en extremos opuestos de la estructura, llamados primero(el que está primero y será el próximo en abandonar la cola) y último (el que llegó último). Implementa la clase `Cola` , donde los elementos `Integer` encolados se guardan en una tabla

## Estructura y funcionamiento

> **ATRIBUTOS**

> `public int cola[]` : representa la cola.

> `public int ultimo` : representa el ultimo elemento de la cola.

> `public int capacidad` : representan la longitud de la cola.

> **METODOS**
>
> `public boolean isEmpty()` : este metodo devuelve true si la cola se encuentra vacia.
>
> `public boolean isFull()` : este metodo devuelve true si la cola se encuentra llena.
>
> `public void enqueue(int elemento)` : este metodo mete al final de la cola el elemento pasado por parametro. 
>
> `public int dequeue()` : este metodo devuelve el primer valor que se ha introducido en la cola.  
>

## Dependencias

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
