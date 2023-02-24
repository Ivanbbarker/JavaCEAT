package tema5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author java
 */
public class ejercicio5_6 {

    public static void main(String[] args) {
        int apuestaJugador[] = new int[pedirLongitudPrimitiva()];
        int primitivaGanadora[] = new int[apuestaJugador.length];
        rellenarArrays(apuestaJugador, primitivaGanadora);
        System.out.print("\nNumeros de aciertos en la primitiva: " + primitiva(apuestaJugador, primitivaGanadora) + "\n");
    }

    public static int primitiva(int apuesta[], int[] combinacionGanadora) {
        int aciertos = 0;
        int arrayConAciertos[] = new int[0];
        System.out.println("---- COMPROBACION DE PRIMITIVA ----");

        for (int i = 0; i < combinacionGanadora.length; i++) {
            System.out.println("Comprobando numero de la posicion [" + i + "] ...\n");
            System.out.println("Numero de la apuesta: " + apuesta[i]);
            System.out.println("Numero de la combinacion: " + combinacionGanadora[i]);
            if (apuesta[i] == combinacionGanadora[i]) {
                System.out.print("\nACIERTO!!\n");
                aciertos++;
                arrayConAciertos = Arrays.copyOf(arrayConAciertos, arrayConAciertos.length + 1);
                arrayConAciertos[arrayConAciertos.length - 1] = apuesta[i];
            }
        }
        System.out.print("\n\nLos numeros premiados y apostados identicos son: " + Arrays.toString(arrayConAciertos));
        System.out.println("---- FIN DEL PROGRAMA DE COMPROBACION ----");
        return aciertos;
    }

    public static int[] rellenarVector(int apuesta[]) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < apuesta.length; i++) {
            System.out.print("Escribe el numero que desees: ");
            apuesta[i] = sc.nextInt();
        }
        return apuesta;
    }

    public static int pedirLongitudPrimitiva() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la longitud del array deseado: ");
        int numero = sc.nextInt();
        return numero;
    }

    public static void rellenarArrays(int[] apuesta, int[] primitiva) {

        System.out.println("\nIntroduzca los numeros ganadoreres de la primitiva: \n");
        primitiva = rellenarVector(primitiva);
        System.out.println("\nIntroduzca los numeros de su apuesta: \n");
        apuesta = rellenarVector(apuesta);
    }

}
