package tema6;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author java
 */
public class actividadPropuesta6_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la frase a ordenar: ");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();
        String[] arrayFrase = frase.split(" ");
        //arrayFrase = ordenar(arrayFrase);     
        Arrays.sort(arrayFrase);
        for (String arrayFrase1 : arrayFrase) {
            System.out.println(arrayFrase1);
        }

    }

}
