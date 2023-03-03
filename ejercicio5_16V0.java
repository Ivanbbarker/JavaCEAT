/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class ejercicicoAplicacion5_16M {

    public static void main(String[] args) {
        int mapa[][] = {{1, 1, 1, 1, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 1, 0},
        {1, 1, 1, 1, 1},
        {1, 0, 1, 0, 1}};
        mostrarMapa(mapa);
        buscaCamino(mapa);
    }

    public static void mostrarMapa(int mapa[][]) {
        for (int i = 0; i < mapa.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 1) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println(" |");
        }

        System.out.println("\nEl mapa tiene un tamaño de " + mapa.length + " posiciones de ancho y " + mapa[0].length + " de largo\n");
    }

    public static void buscaCamino(int mapa[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la coordenada X desde donde empezamos: ");
        int origenX = sc.nextInt();
        System.out.print("Introduce la coordenada Y desde donde empezamos: ");
        int origenY = sc.nextInt();
        System.out.print("Introduce la coordenada X hacia donde queremos llegar: ");
        int destinoX = sc.nextInt();
        System.out.print("Introduce la coordenada X hacia donde queremos llegar: ");
        int destinoY = sc.nextInt();
        
        System.out.println("Origen: ["+origenX+"]["+origenY+"]");
        System.out.println("Destino: ["+destinoX+"]["+destinoY+"]");
        
        mostrarCamino(mapa, origenX,origenY, destinoX, destinoY);        

    }

    public static void mostrarCamino(int mapa[][], int origenX, int origenY, int destinoX, int destinoY) {
        System.out.println("Comenzamos camino desde "+ mapa[origenX][origenY]);
        if (mapa[destinoX][destinoY] == 1) {
            System.out.println("El lugar es accesible");
        }
    }
}
