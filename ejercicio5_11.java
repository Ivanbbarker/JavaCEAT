package tema5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class ejercicio5_11 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Longitud de la combinacion secreta: ");
        int longitud = sc.nextInt();
        int combSecreta[] = new int [longitud];
        int combJugador[] = new int [longitud];
        
        generaCombinaciones(combSecreta);
        //System.out.println(Arrays.toString(combSecreta));
        System.out.println("Escriba combinacion: ");
        leeTabla(combJugador);
        
        while (!Arrays.equals(combSecreta, combJugador)) {
            muestraPista(combSecreta,combJugador);
            System.out.println("Escriba una combinacion: ");
            leeTabla(combJugador);
        }
        System.out.println("¡ LA CAMARA ESTA ABIERTA !");
    }

    private static void generaCombinaciones(int t[]) {
        final int MAX = 5;
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * MAX + 1);
        }
    }

    private static void leeTabla(int t[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }

    private static void muestraPista(int secret[], int jug[]) {

        System.out.print("Pista:\n ");
        for (int i = 0; i < jug.length; i++) {
            if (secret[i] > jug[i]) {
                System.out.println("Mayor");
            } else if (secret[i] < jug[i]) {
                System.out.println("Menor");
            } else {
                System.out.println("Igual");
            }
        }
    }

}
