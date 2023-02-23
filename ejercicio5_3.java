package tema5;

import java.util.Scanner;

public class ejercicio5_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros deseas introducir: ");
        int n = sc.nextInt();
        int t[] = new int[n];

        for (int i = 0; i < t.length; i++) {
            System.out.print("Introduce un numero: ");
            t[i] = sc.nextInt();
        }
        System.out.print("Los numeros inversamente son: [");
        for (int i = t.length - 1; i >= 0; i--) {
            System.out.print(t[i] + ", ");
        }
        System.out.print("]\n\n");
        
        System.out.println("El numero maximo es: "+ maximo(t));
    }

    public static int maximo(int t[]) {
        int max = t[0];
        for (int e : t) {
            if (e > max) {
                max = e;
            }
        }

        return max;
    }

}
