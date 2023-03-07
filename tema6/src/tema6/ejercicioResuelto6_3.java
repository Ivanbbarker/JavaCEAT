package tema6;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class ejercicioResuelto6_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pasword, palabra;
        System.out.print("Jugador 1. Introduce la contraseña: ");
        pasword = sc.nextLine();
        do {            
            System.out.print("Jugador 2. Palabra: ");
            palabra = sc.nextLine();
            int comparacion = pasword.compareTo(palabra);
            if (comparacion == 0) {
                System.out.println(" ¡ACERTASTE!");
            } else if(comparacion < 0) {
                System.out.println("La contraseña es menor que: "+palabra);
            } else {
                System.out.println("La contraseña es mayor que: "+palabra);
            }
        } while (!pasword.equals(palabra));
    }
}
