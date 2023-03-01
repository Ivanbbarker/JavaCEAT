package ejercicio5_19;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5_19 {

    public static void main(String[] args) {
        int t[] = llegadaCorredores();
        System.out.println(Arrays.toString(t));
        dopados(t);
        System.out.println(Arrays.toString(t));
    }

    public static int[] llegadaCorredores() {
        int copiaT[] = new int[0];
        Scanner sc = new Scanner(System.in);
        int dorsal;
        do {
            System.out.print("Introduce el dorsal del participante: ");
            dorsal = sc.nextInt();
            if (dorsal != -1) {
                copiaT = Arrays.copyOf(copiaT, copiaT.length + 1);
                copiaT[copiaT.length - 1] = dorsal;
                System.out.println("Dorsal: " + dorsal + ", Posicion: " + (copiaT.length - 1));
            }
        } while (dorsal != -1);
        return copiaT;
    }

    public static void mostrarGanadores(int t[]) {
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 ->
                    System.out.println("Medalla de ORO, DORSAL:" + t[i]);
                case 1 ->
                    System.out.println("Medalla de PLATA, DORSAL: " + t[i]);
                case 3 ->
                    System.out.println("Medalla de BRONCE, DORSAL:" + t[i]);
            }
        }
    }

    public static void dopados(int t[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(introduce -1 para parar de introducir dorsales)");
        int dorsal;
        do {
            System.out.print("Introduce el dorsal del participante dopado: ");
            dorsal = sc.nextInt();
            int indiceBusqueda = 0;
            while (indiceBusqueda < t.length && t[indiceBusqueda] != dorsal) {
                indiceBusqueda++;
            }
            if (indiceBusqueda < t.length) {
                t = Arrays.copyOf(t, t.length + 1);
                t[t.length-1] = t[indiceBusqueda];
                t = Arrays.copyOf(t, t.length-1);
            } else {
                System.out.println("Ese dorsal no se encuentra en la carrera.");
            }
        } while (dorsal != -1);

    }
    
        public static void dopadosv2(int t[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(introduce -1 para parar de introducir dorsales)");
        int dorsal;
        do {
            System.out.print("Introduce el dorsal del participante dopado: ");
            dorsal = sc.nextInt();
            int indiceBusqueda = 0;
            while (indiceBusqueda < t.length && t[indiceBusqueda] != dorsal) {
                indiceBusqueda++;
            }
            if (indiceBusqueda < t.length) {
                t = Arrays.copyOf(t, t.length + 1);
                t[t.length-1] = t[indiceBusqueda];
                t = Arrays.copyOfRange(t, indiceBusqueda, t.length+1);
            } else {
                System.out.println("Ese dorsal no se encuentra en la carrera.");
            }
        } while (dorsal != -1);

    }

}
