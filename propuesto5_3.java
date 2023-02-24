package tema5;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class propuesto5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros deseas introducir: ");
        int n = sc.nextInt();
        int mediapositivos = 0, mediaNegativos = 0, contador0 = 0;
        int contadorP = 0, contadorNegativos = 0;
        
        int t[] = new int[n];

        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduce un numero: ");
            t[i] = sc.nextInt();
        }

        for (int i = 0; i < t.length; i++) {
            if (t[i] > 0) {
                mediapositivos = mediapositivos + t[i];
                contadorP++;
            } else if (t[i] == 0) {
                contador0++;
            } else {
                mediaNegativos = mediaNegativos + t[i];
                contadorNegativos++;
            }
        }

        System.out.println("Media de positivos = " + mediapositivos / contadorP);
        System.out.println("Media de negativos = " + mediaNegativos / contadorNegativos);
        System.out.println("Numero de ceros = " + contador0);
    }
}
