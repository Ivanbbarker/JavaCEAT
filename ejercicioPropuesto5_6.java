/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Arrays;

/**
 *
 * @author java
 */
public class ejercicioPropuesto5_6 {

    public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5};
        int elemento = 3;
        System.out.println("Tabla antes del borrado: " + Arrays.toString(tabla));
        tabla = borrarElemento(tabla, elemento);
        System.out.println("Tabla después del borrado: " + Arrays.toString(tabla));

    }

    public static int[] borrarElemento(int[] tabla, int elemento) {
        int indice = Arrays.binarySearch(tabla, elemento);
        if (indice >= 0) {
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
        }
        return Arrays.copyOf(tabla, (tabla.length - 1));
    }

}
