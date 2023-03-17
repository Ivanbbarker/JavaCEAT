package tema5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class EjercicioAplicacion5_14 {

    public static void main(String[] args) {
        int sueldos[] = new int[0];
        sueldos = crearArraySueldos(sueldos);
        System.out.println(Arrays.toString(sueldos));
        sueldos = ordenadoDecreciente(sueldos);
        System.out.println(Arrays.toString(sueldos));
        System.out.println("La media de sueldos es de: " + mediaSueldos(sueldos));
        valoresMaxMin(sueldos);
    }

    public static int[] crearArraySueldos(int t[]) {
        Scanner sc = new Scanner(System.in);
        int sueldo = 0;
        while (sueldo != -1) {
            System.out.print("Introduce un nuevo sueldo: ");
            sueldo = sc.nextInt();
            if (sueldo != -1) {
                t = Arrays.copyOf(t, t.length + 1);
                t[t.length - 1] = sueldo;
            }
        }
        System.out.println("\nHa terminado de introducir sueldos.");
        return t;
    }

    public static int[] ordenadoDecreciente(int t[]) {
        Arrays.sort(t);
        int[] tTemporal = new int[0];
        int contadorT = 0;
        for (int i = t.length - 1; i < 0; i--) {
            tTemporal = Arrays.copyOf(tTemporal, tTemporal.length + 1);
            tTemporal[tTemporal.length - 1] = t[contadorT];
            contadorT++;
        }
        return tTemporal;
    }

    public static double mediaSueldos(int t[]) {
        double media = 0;
        for (int i = 0; i < t.length; i++) {
            media = media + t[i];
        }
        media = media / t.length;
        return media;
    }

    public static void valoresMaxMin(int t[]) {
        int sueldoMax = t[0];
        int sueldoMin = t[0];

        for (int i = 1; i < t.length; i++) {
            if (sueldoMax < t[i]) {
                sueldoMax = t[i];
            }
            if (sueldoMin > t[i]) {
                sueldoMin = t[i];
            }
        }

        System.out.println("El sueldo maximo es: " + sueldoMax);
        System.out.println("El sueldo minimo es: " + sueldoMin);
    }
}
