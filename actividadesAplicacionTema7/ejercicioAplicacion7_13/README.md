## Ejercicio 7.13 Colores
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

En el momento de decorar una casa, una habitación o cualquier objeto, se plantea el problema de elegir la paleta de colores que vamos a utilizar en nuestra decoración. Existe una solución, algo atrevida, que consiste en utilizar colores al azar.

Diseña la calse `Colores`, que alberga por defecto una serie de colores (mediante una cadena), aunque es posible añadir tantos como necesitemos. La clase tendrá un metodo que devuelva una tabla con los n colores que necesitemos elegidos al azar sin repeticiones.

## Estructura y funcionamiento

> **ATRIBUTOS**

> `String[] colores` : array de tipo String donde almacenamos ciertos colores por defecto.

> **METODOS**

> `public void añadirColores(String colores)`: metodo que nos permite añadir un color escrito por pantalla que se añade a nuestra paleta de colores.

> `public int getIndiceAleatorio(int max)`: metodo que devuelve el indice aleatorio donde `max` es el numero maximo de colores que existen en nuestra paleta.

> `public boolean comprobarRepetidos(int[] indicesRepetidos, String[] coloresAleatorios)`: metodo que comprueba si el color que si se repiten los colores.

> `public String[] getColoresAleatorios(int numColores)`: metodo que genera una paleta de N numero de colores, descritos previamente por el usuario, y generando dicha paleta de forma aleatoria entre todos los colores que presta nuestra tableta habiendo o no añadido algun color mas.

## Dependencias

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)



