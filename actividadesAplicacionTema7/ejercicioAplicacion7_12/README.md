## Ejercicio 7.12 Ecuacion de segundo grado

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

> Implementa una clase que permita resolver ecuaciones de segundo grado. Los coeficientes pueden indicarse en el constructor y modificarse a posteriori. Es fundamental que la clase disponga de un metodo que devuelva las distintas soluciones y de un metodo que nos informe si el discriminante es positivo.

> **Soluciones de una ecuación de segundo grado**

Si queremos saber las posibles soluciones de la ecuación sin llegar a resolverla nos podemos fijar en el valor del radicando:

            D=b 2– 4ac (discriminante)

- Si >0, es decir, si b 2– 4ac es positivo, hay dos soluciones reales y distintas.

- Si = 0, es decir, si b 2– 4ac es cero, tiene una solución.

- Si <0, es decir, si b 2– 4ac es negativo, no tiene solución


## Estructura y funcionamiento

> **ATRIBUTOS**

> `public double A` : representa el coeficiente A de una ecuacion de segundo grado.

> `public double B` : representa el coeficiente B de una ecuacion de segundo grado.

> `public double C` : representa el coeficiente C de una ecuacion de segundo grado.


> **METODOS**

> `public double realizarDisciminante()` : Metodo que nos devuelve por pantalla el numero de soluciones que tiene nuestra ecuacion pasada por parametros, y en caso de ser 0 o de tener dos soluciones, devuelve el valor del discriminante en cuestion. 

> `public void ecuacionSegundoGradoPositiva()` : Metodo que devuelve por pantalla la solucion de la ecuacion utilizando el signo positivo en la ecuacion.

> `public void ecuacionSegundoGradoNegativa()` : Metodo que devuelve por pantalla la solucion de la ecuacion utilizando el signo negativo en la ecuacion.

> `void mostrarEcuacion()` : metodo que devuelve la ecuacion con los simbolos y numeros pasados al constructos al comienzo del programa Main.

## Dependencias

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
