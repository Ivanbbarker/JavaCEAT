import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        System.out.print("Hora: ");
        int valor = sc.nextInt();
        h.setHora(valor);
        System.out.print("Minuto: ");
        valor = sc.nextInt();
        h.setMinuto(valor);
        System.out.print("Segundo: ");
        valor = sc.nextInt();
        h.setSegundo(valor);
        System.out.print("Cuantos segundos quiere mostrar: ");
        int numSegundos = sc.nextInt();
        for (int i = 0; i <= numSegundos; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementarSegundo();
        }
    }
}
