package tema6;


import java.util.Scanner;

/**
 *
 * @author java
 */
public class ejercicioResuelto6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera frase: ");
        String frase1 = sc.nextLine();
        System.out.print("Introduce la segunda frase: ");
        String frase2 = sc.nextLine();

        int long1 = frase1.length();
        int long2 = frase1.length();

        if (long1 > long2) {
            System.out.println(frase1 +" es mas larga que "+ frase2);
        } else if (long1 < long2) {
            System.out.println(frase2 +" es mas larga que "+ frase1);
        } else {
            System.out.println("Son exactamente iguales");
        }

    }
}
