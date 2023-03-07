package tema6;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class ejercicioResuelto6_3B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pasword, palabra;
        System.out.print("Jugador 1. Introduce la contraseña: ");
        pasword = sc.nextLine();
        System.out.println("La contraseña tiene " + pasword.length() + " caracteres");
        do {
            System.out.print("Jugador 2. Introduzca palabra de nuevo: ");
            palabra = sc.nextLine();
        } while (pasword.length() != palabra.length());

        while (!palabra.equals(pasword)) {
            String pista = "";
            for (int i = 0; i < pasword.length(); i++) {
                if (pasword.charAt(i) == palabra.charAt(i)) {
                    pista += pasword.charAt(i);
                } else {
                    pista += '*';
                }
            }

            System.out.println(pista);
            System.out.print("Jugador 2. Introduzca palabra de nuevo: ");
            palabra = sc.nextLine();
            do {
                System.out.print("Jugador 2. Introduzca palabra de nuevo: ");
                palabra = sc.nextLine();
            } while (pasword.length() != palabra.length());
        }
        System.out.println("¡Acertaste!");
    }
}
