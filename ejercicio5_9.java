package tema5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class ejercicio5_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int puntos[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Puntos programador (" + (i + 1) + ") : ");
            puntos[i] = sc.nextInt();
        }

        Arrays.sort(puntos);
        System.out.println("Puntuacion: " + Arrays.toString(puntos));

        System.out.print("Puntos del programador de la exihibcion: ");
        int puntosPorgExh = sc.nextInt();
        while (puntosPorgExh != -1) {
            int pos = Arrays.binarySearch(puntos, puntosPorgExh);
            int indiceInsercion = 0;
            if (pos < 0) {
                indiceInsercion = -pos - 1;
            } else {
                indiceInsercion = pos;
            }

            int copia[] = new int[puntos.length + 1];

            System.arraycopy(puntos, 0, copia, 0, indiceInsercion);
            System.arraycopy(puntos, indiceInsercion, copia, indiceInsercion + 1, puntos.length - indiceInsercion);
            
            copia[indiceInsercion] = puntosPorgExh;
            puntos = copia;
            
            System.out.print("Puntos del programador exhibicion: ");
            puntosPorgExh = sc.nextInt();
            
        }
        
        System.out.println("Puntuacion final: "+ Arrays.toString(puntos));
    }
}
