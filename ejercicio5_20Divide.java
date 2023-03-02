/*
 * La fusion de dos tablas ordenadas consiste en copiar todos sus elementos ( de 
 * ambas tablas) en una tercera que deberá seguir ordenada. Podemos realizar una
 * fusión <<ineficiente>> copiando los elementos de ambas tablas(sin tener en 
 * cuenta el orden) en la tabla final y ordenar esta. Existe una manera óptima  
 * de realizar la fusion optima de realizar la fusion en la que se eleige en 
 * cada momento el primer elemento no copiado de alguna de las tablas y se añade
 * de la tabla final, que seguirá ordenada sin necesidad de ordenacion alguna.
 * Busca informacion sobre el algoritmo de fusion e implementalo en JAVA.
 */
package ejercicio5_20;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5_20 {

    public static void main(String[] args) {
        /**
         * Pedimos la longitud y creamos los arrays unidimensionales de nombre
         * "t[]" y "x[]"
         */
        int t[] = new int[pedirLongitudArray()];
        t = crearArray(t);
        int x[] = new int[pedirLongitudArray()];
        x = crearArray(x);
        /**
         * Creamos un array unidimensional donde uniremos las dos tablas
         * ordenadas, en una que no lo estará, de nombre "desordenadaT[]"
         */
        int desordenadaT[] = new int[(t.length + x.length)];
        desordenadaT = unirDesordenada(t, x);
        //Aplicamos el algoritmo divide y venceras (recursivo)
        divideVenceras(desordenadaT, 0, desordenadaT.length - 1);
        //Mostramos el array ordenado
        System.out.print("[ ");
        for (int i = 0; i < desordenadaT.length; i++) {
            System.out.print(desordenadaT[i] + ", ");
        }
        System.out.print("]");
    }

    public static int pedirLongitudArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce la longitud que desees: ");
        int numero = sc.nextInt();
        return numero;
    }

    public static int[] crearArray(int t[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            System.out.print("\nIntroduce el valor que desees: ");
            t[i] = sc.nextInt();
        }

        return t;
    }

    public static int[] unirDesordenada(int t[], int x[]) {
        int arrayEntero[] = new int[0];

        for (int i = 0; i < t.length; i++) {
            arrayEntero = Arrays.copyOf(arrayEntero, arrayEntero.length + 1);
            arrayEntero[arrayEntero.length - 1] = t[i];
        }
        for (int i = 0; i < x.length; i++) {
            arrayEntero = Arrays.copyOf(arrayEntero, arrayEntero.length + 1);
            arrayEntero[arrayEntero.length - 1] = x[i];
        }
        return arrayEntero;
    }

    public static void divideVenceras(int[] t, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            divideVenceras(t, izquierda, medio);
            divideVenceras(t, medio + 1, derecha);
            unirOrdenada(t, izquierda, medio, derecha);
        }
    }

    public static void unirOrdenada(int[] t, int izquierda, int medio, int derecha) {
        int[] arrayOrdenado = new int[t.length];
        int inicioDerecha = medio + 1;
        int temporal = izquierda;
        int indice = izquierda;
        // Compare el tamaño de matriz de las posiciones de subíndice 
        //correspondientes de las dos matrices pequeñas, colocando primero las 
        //pequeñas en la nueva matriz
        while (izquierda <= medio && inicioDerecha <= derecha) {
            if (t[izquierda] <= t[inicioDerecha]) {
                arrayOrdenado[indice++] = t[izquierda++];
            } else {
                arrayOrdenado[indice++] = t[inicioDerecha++];
            }
        }
        // Si hay datos a la izquierda que deben copiarse, 
        //copia la matriz restante de la izquierda a la nueva matriz ordenda
        while (izquierda <= medio) {
            arrayOrdenado[indice++] = t[izquierda++];
        }
        // Si hay datos a la derecha que deben copiarse, 
        // copia la matriz restante de la derecha a la nueva matriz ordenada
        while (inicioDerecha <= derecha) {
            arrayOrdenado[indice++] = t[inicioDerecha++];
        }
        while (temporal <= derecha) {
            t[temporal] = arrayOrdenado[temporal++];
        }
    }
}
