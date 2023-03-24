## Ejercicio 7.11 MarcaPagina 
[Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

El cifrado Cesar es una forma sencilla de modificar un texto para que no sea entendible a quienes no conocen el codigo. Este cifrado consiste en modificar cada letra de un texto  por otra que se encuentra en el alfabeto N posiciones detras.

    Por ejemplo, para un valor de N igual a 3, la letra "a" se codifica con la "d", y la letra "q",
    se codifica con la "x". En el caso de que una letra exceda a la "z", seguiremos de forma 
    circular utilizando la "a". Solo se cifrarán las letras, mayúsculas o minúsculas.
    
    Realiza una clase que, mediante un método estático, devuelva cifrado el texto que se le pasa
    con un paso de N letras.

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



