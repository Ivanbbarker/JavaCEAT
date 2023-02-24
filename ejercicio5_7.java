package tema5;

import java.util.Arrays;

public class ejercicio5_7 {

    public static void main(String[] args) {

    }

    public static int[] repetidos(int[] t) {
        int temporal[] = new int[10];

        for (int i : t) {
            if (buscar(temporal, i) == -1) {
                temporal = Arrays.copyOf(temporal, temporal.length + 1);
                temporal[temporal.length - 1] = i;
            }
        }

        return temporal;
    }
/* 
    ACTIVIDAD PROPUESTA 5.3
    */ 
    public static int buscar(int t[], int clave) {
        int numero = -1;
        for (int i : t) {
            if (t[i] == clave) {
                numero = clave;
            }
        }
        return numero;
    }

}
