package tema6;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class actividadPropuesta6_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println(frase);
        System.out.println(camello(frase));

    }

    public static String camello(String frase) {
        String fraseNueva = "";
        frase = frase.toLowerCase().strip();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            fraseNueva = fraseNueva + c;
            if (Character.isSpaceChar(c)) {
                c = frase.charAt(i+1);
                i++;
                fraseNueva = fraseNueva + Character.toUpperCase(c);
            }
        }
        return fraseNueva.replaceAll(" ", "");
    }

}
