import java.util.Scanner;
import java.lang.Math;

public class ejercicio3_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero a realizar la raiz: ");
        int raiz = 23, resto = 0, svRaiz = 0;

        for (int i = 1; i < raiz; i++) {

            if ((int) Math.pow(i, 2) == raiz) {
                svRaiz = i;
                resto = 0;
                break;
            }

            if ((int) Math.pow(i, 2) < raiz && (int) Math.pow(i + 1, 2) > raiz) {
                resto = raiz - (int) Math.pow(i, 2) % raiz;
                svRaiz = i;
                break;
            }
        }
        System.out.println("Raiz cuadrada " + svRaiz + " con resto " + resto);

        teclado.close();

    }
}