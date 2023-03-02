package Ejercicios_Aplicacion_5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioAplicacion5_18 {
    public static void main(String[] args) {
        int magica[][] = new int[4][4];
        magica = introduceMatriz(magica);
        boolean magician = esMagica(magica);
    }

    public static int[][] introduceMatriz(int magic[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < magic.length; i++) {
            for (int j = 0; j < magic[i].length; j++) {
                System.out.println("Introduce el numero de la posicion [" + i + "] [" + j + "]: ");
                magic[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(magic));
        return magic;
    }

    public static boolean esMagica(int magic[][]) {
        boolean esMagic = false;
        int sumaF1 = 0, sumaF2 = 0, sumaF3 = 0, sumaF4 = 0;
        int sumaC1 = 0, sumaC2 = 0, sumaC3 = 0, sumaC4 = 0;
        //filas
        for (int i = 0; i < magic.length; i++) {
            System.out.println("FILA NUMERO: [" + i + "]");
            for (int j = 0; j < magic[i].length; j++) {
                if (i == 0) {
                    sumaF1 = sumaF1 + magic[i][j];
                } else if (i == 1) {
                    sumaF2 = sumaF2 + magic[i][j];
                } else if (i == 2) {
                    sumaF3 = sumaF3 + magic[i][j];
                } else {
                    sumaF4 = sumaF4 + magic[i][j];
                }
            }
            
        }
        //columnas
        for (int i = 0; i < magic[i].length; i++) {
            for (int j = 0; j < magic.length; j++) {
                System.out.println("COLUMNA NUMERO: [" + j + "]");
                if (j == 0) {
                    sumaC1 = sumaC1 + magic[i][j];
                } else if (i == 1) {
                    sumaC2 = sumaC2 + magic[i][j];
                } else if (i == 2) {
                    sumaC3 = sumaC3 + magic[i][j];
                } else {
                    sumaC4 = sumaC4 + magic[i][j];
                }
            }
            
        }
        esMagic = comprobarSumas(sumaF2, sumaF3, sumaF4, sumaF1);
        System.out.println(sumaF1 + " " + sumaF2 + " " + sumaF3 + " " + sumaF4);
        System.out.println("Es una matriz magica? : "+esMagic+ " ( false: no lo es, true: si lo es)");
        return esMagic;
    }

    public static boolean comprobarSumas(int s1, int s2, int s3, int s4) {
        boolean resultado = false;
        if (s1 == s2 && s2 == s3 && s3 == s4) {
            resultado = true;
        }
        return resultado;
    }
}
