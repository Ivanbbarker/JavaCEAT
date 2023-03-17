package Ejercicios_Aplicacion_5;

import java.util.Arrays;

/*
 * Realiza la funcion "int [] buscarTodos(int t[], int clave)", que crea y devuelve una
 * tabla con todos los indices de los elementos donde se encuentra la clave de búsqueda.
 * En el caso de que 'clave' no se encuentre en la tabla 't', la funcion devolverá una tabla vacía.
 */

public class ejercicioAplicacion5_1 {

    public static void main(String[] args) {
        int[] tabla = { 3, 5, 6, 3 };
        int clave = 3;
        tabla = buscarTodos(tabla, clave);
        System.out.println(Arrays.toString(tabla));
    }

    public static int[] buscarTodos(int t[], int clave) {
        int[] tablaNueva = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                System.out.println("¡¡Coincidencia!![" + i + "] \nGuardando indice de coincidencia...");
                tablaNueva = Arrays.copyOf(tablaNueva, tablaNueva.length + 1);
                tablaNueva[tablaNueva.length - 1] = i;
            }
        }
        if (tablaNueva.length == 0) {
            System.out.println("No se ha encontrado ninguna coincidencia.\nGenerando array vacio...");
            tablaNueva = Arrays.copyOf(tablaNueva, t.length);
        }
        return tablaNueva;
    }
}
