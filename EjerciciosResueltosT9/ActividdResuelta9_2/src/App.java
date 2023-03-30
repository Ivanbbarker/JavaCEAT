import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /// Cola ///
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
        
        ///Pila///
        Lista p =  new Lista();
        System.out.println("Introduce un numero: ");
        Integer N  = new Scanner(System.in).nextInt();
        
        while( N >= 0){
            p.apilar(N);
            System.out.println("Introducie numero: ");
            N = new Scanner(System.in).nextInt();
            System.out.println();
        }

        N = c.desapilar();
        while (N != null) {
            System.out.println(N + " ");
            N = c.desapilar();
        }

        System.out.println("");
        


    }
}
