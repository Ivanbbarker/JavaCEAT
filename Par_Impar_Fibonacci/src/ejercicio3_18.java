import java.util.Scanner;

public class ejercicio3_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, nMin, minMul = 0;
        System.out.print("Introduce el primer numero: ");
        n1 = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        n2 = teclado.nextInt();
        if (n1 < n2) {
            nMin = n1;
        } else {
            nMin = n2;
        }
        for (int i = 2; i <= nMin; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                minMul = i;
                break;
            }
        }
        System.out.println("El minimo comun multiplo es: " + minMul);
        teclado.close();
    }
}