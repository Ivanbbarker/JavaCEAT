## Ejercicio 7.11 MarcaPagina 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

El cifrado Cesar es una forma sencilla de modificar un texto para que no sea entendible a quienes no conocen el codigo. Este cifrado consiste en modificar cada letra de un texto  por otra que se encuentra en el alfabeto N posiciones detras.

    Por ejemplo, para un valor de N igual a 3, la letra "a" se codifica con la "d", y la letra "q",
    se codifica con la "x". En el caso de que una letra exceda a la "z", seguiremos de forma 
    circular utilizando la "a". Solo se cifrarán las letras, mayúsculas o minúsculas.
    
    Realiza una clase que, mediante un método estático, devuelva cifrado el texto que se le pasa
    con un paso de N letras.

## Estructura y funcionamiento

> **ATRIBUTOS**
>
> `int desplazamiento`: representa el desplazamiento de las letras para codificarlo

> **METODOS**
>
> 1. `public String cifrado(String cadenaOriginal)` : su funcionalidad consiste en el cifrado del mensaje mediante el valor de las letras en codigo ASCCI, teniendo en cuenta las Mayúsculas, moviendolas las posiciones definidas en el objeto como `desplazamiento`.
>
> 2. `public String cifradoInverso(String cadenaOriginal)` : su funcionamiento es es el mismo que el metodo `cifrado(String cadenaOriginal)`, pero con la peculiaridad de que es el procedimiento inverso al del metodo citado.

## Dependencias

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)



