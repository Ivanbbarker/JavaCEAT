import java.util.Scanner;

public class ejercicio3_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero de filas: ");
        int nFilas = teclado.nextInt();
        for (int i = 0; i < nFilas; i++) {
            int pascal = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal + " ");
                pascal = pascal * (i - j) / (j + 1);
            }
            System.out.println();
        }
        teclado.close();
    }
}
