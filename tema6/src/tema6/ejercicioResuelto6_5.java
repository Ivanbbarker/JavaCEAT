package tema6;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class ejercicioResuelto6_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String antes, despues;
        System.out.print("Escribe una cadena: ");
        antes = sc.nextLine();
        despues = alReves(antes);
        System.out.println(despues);
    }

    static String alReves(String cadena) {
        String nueva = "";
        for (int i = 0; i < cadena.length(); i++) {
            nueva = cadena.charAt(i) + nueva;
        }
        return nueva;
    }

}
