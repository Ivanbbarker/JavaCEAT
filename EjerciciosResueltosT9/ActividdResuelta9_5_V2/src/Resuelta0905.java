package resuelta09.pkg05;

import java.util.Scanner;

public class Resuelta0905 {

    public static void main(String[] args) {
        Cola cola = new Cola() {
            Lista l = new Lista(); //aquí guardamos los números

            @Override
            public void encolar(Integer nuevo) {
                l.insertarFinal(nuevo);
            }

            @Override
            public Integer desencolar() {
                return l.eliminar(0);
            }
        };
        System.out.print("Introducir número(negativo para salir): ");
        Integer n = new Scanner(System.in).nextInt();
        while (n >= 0) {
            cola.encolar(n);
            System.out.print("Introducir número: ");
            n = new Scanner(System.in).nextInt();
        }
        n = cola.desencolar();
        while (n != null) {
            System.out.print(n + " ");
            n = cola.desencolar();
        }
    }

}
