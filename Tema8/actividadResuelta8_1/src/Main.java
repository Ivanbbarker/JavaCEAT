import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Hora r = new Hora(11, 30);
         * System.out.println(r);
         * for (int i = 1; i <= 61; i++) {
         * r.inc();
         * }
         * System.out.println(r);
         * System.out.println("Escribe una hora: ");
         * int hora = new Scanner(System.in).nextInt();
         * boolean cambio = r.setHora(hora);
         * if (cambio) {
         * System.out.println(r);
         * } else {
         * System.out.println("La hora no se puede cambiar");
         * }
         */

        /*
         * HoraExacta r = new HoraExacta(11, 15, 23);
         * System.out.println(r);
         * for (int i = 1; i <= 61; i++) {
         * r.inc();
         * }
         * System.out.println(r);
         * System.out.println("Escribe los segundos: ");
         * int segundos = new Scanner(System.in).nextInt();
         * if (r.setSegundos(segundos)) {
         * System.out.println(r);
         * } else {
         * System.out.println("No es posible cambiar los segundos");
         * }
         */

        HoraExacta a = new HoraExacta(1, 2, 3);
        HoraExacta b = new HoraExacta(1, 2, 3);
        HoraExacta c = new HoraExacta(10, 20, 30);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

    }

}
