package tema5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double t[]  = new double [5];
        
        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduce un numero: ");
            t[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(t));
    }
}
