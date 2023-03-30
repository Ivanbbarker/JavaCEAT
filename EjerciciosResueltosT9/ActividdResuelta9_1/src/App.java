import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Lista c =  new Lista();
        System.out.println("Introduce un numero: ");
        Integer n  = new Scanner(System.in).nextInt();
        
        while( n >= 0){
            c.encolar(n);
            System.out.println("Introducie numero: ");
            n = new Scanner(System.in).nextInt();
            System.out.println();
        }

        n = c.desencolar();
        while (n != null) {
            System.out.println(n + " ");
            n = c.desencolar();
        }

        System.out.println("");

    }
}
