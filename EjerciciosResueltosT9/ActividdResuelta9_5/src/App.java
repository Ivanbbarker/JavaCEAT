import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cola cola = new Cola(){
            Lista l = new Lista();
            @Override
            public void encolar(Integer nuevo) {
                System.out.println("hOLA");
                l.insertarFinal(nuevo);
            }
            @Override
            public Integer desencolar() {
                return l.eliminar(0);
            }
        };
        System.out.println("Introducir un numero(negativo para salir): ");
        Integer n = new Scanner(System.in).nextInt();
        while (n >= 0) {
            cola.encolar(n);
            System.out.println("Introducir numero: ");
            n = new Scanner(System.in).nextInt();
        }

        n = cola.desencolar();
        while (n!= null) {
            System.out.println(n + "");
            n = cola.desencolar();
        }

    }
}
