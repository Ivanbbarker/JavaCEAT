## Ejercicio 7.15 Calendario
[Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

Diseña la calse Calendario que representa una fecha concreta(año, mes y dia).

    Por simplicidad, solo tendremos en consideracion que existen meses con distinto numero de dias, pero no tendremos en        cuenta los años bisiestos.

## Estructura y funcionamiento

> **ATRIBUTOS**

> `public int paginaLeida` : representa las paginas leidas que llevamos.
> `public int paginaMax` : representa las paginas totales del libro.
> `public int PaginasRestantes` : representan las paginas restantes que quedan en el libro.

> **METODOS**

> `Calendario(int año, int mes, int dia)` : que crea un objeto con los datos pasados como parametros, siempre y cuando, la fecha que representen sea correcta.

> `void incrementarDia()` : que incrementa en un dia la fecha del calendario.

> `void incrementarMes()` : que incrementa en un mes la fecha del calendario.

> `void incrementarAño(int cantidad)` : que incrementa la fecha del calendario en el numero de años especificados. Ten en cuenta que el año 0 no existió.

> `boolean iguales(Calendario otraFecha)`: que determina si la fecha invocante y la que se pasa como parametro son iguales o distintas. 

> `void mostrar()`: muestra la fecha por consola

## Dependencias

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)



