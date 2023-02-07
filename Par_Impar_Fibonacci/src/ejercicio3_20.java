import java.util.Locale;
import java.util.Scanner;

public class ejercicio3_20 {
    public static void main(String[] args) {
        double suma = 0, numero;
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        do {
            System.out.print("Introduce el dinero: ");
            numero = teclado.nextDouble();
            suma += numero;
        } while (numero != 0);
        teclado.close();
        System.out.println("El dinero total es: " + suma + " euros.");
    }
}
