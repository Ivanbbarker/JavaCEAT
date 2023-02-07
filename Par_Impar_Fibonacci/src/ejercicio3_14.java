import java.util.Scanner;

/* Numeros primos a partir de N, desde 1 a N */
public class ejercicio3_14 {
    public static void main(String[] args) {
        int numero, contadorPrimos = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero: ");
            numero = teclado.nextInt();
        } while (numero == 0);
        for (int j = 2; j < numero; j++) {
            for (int i = 2; i < numero; i++) {
                if (j % i != 0) {
                    contadorPrimos++;
                    break;
                }
            }
        }
        System.out.println("Existen " + contadorPrimos + " numeros primos entre el 1 y el " + numero);
        teclado.close();
    }
}
