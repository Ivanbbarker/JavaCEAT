package tema6;

import java.util.Scanner;
/**
 *
 * @author java
 */
public class ejercicioResuelto6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        int numEspaciosBlancos = 0;
        char c;
        System.out.print("Escribe una frase: ");
        frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            if (Character.isSpaceChar(c)) {
                numEspaciosBlancos++;
            }
        }
        System.out.println("Tiene: "+numEspaciosBlancos+" espacios en blanco.");
    }
}
