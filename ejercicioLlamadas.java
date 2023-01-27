
import java.util.Locale;
import java.util.Scanner;
/**
*Hacer un programa que nos calcule el coste de las llamadas.

El coste total dependerá del tiempo de duración:
Los primeros cinco minutos cuestan 1 euro, los siguientes tres minutos, cuestan 80 céntimos,
los siguientes dos minutos a 70 céntimos y a partir del décimo minuto, 50 céntimos.

Además, se carga un impuesto de 3% cuando es domingo, y si es otro día, en turno de mañana 15% y en turno de tarde 10%.

Realiza un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
*
*/


public class ejercicioLlamadas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int dia;
        double duracionLlamada = 0;
        boolean franjaMañana;

        System.out.print("Que dia de la semana es(1 a 7): ");
        dia = sc.nextInt();
        System.out.print("Es por la manana (True o False):");
        franjaMañana = sc.nextBoolean();
        System.out.println("Cuanto ha durado la llamada ?(en minutos)");
        duracionLlamada = sc.nextDouble();

        if (dia == 7) {
            double precio = 0;
            final double impuesto = 0.03;
            if (duracionLlamada < 5) {
                precio = duracionLlamada * 100;
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 5 && duracionLlamada <= 8) {
                precio = 500 + ((duracionLlamada - 5) * 80);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 8 && duracionLlamada < 11) {
                precio = 500 + 340 + ((duracionLlamada - 8) * 70);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 10) {
                precio = 500 + 340 + 140 + ((duracionLlamada - 10) * 50);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            }

        } else if (franjaMañana == true) {
            double precio = 0;
            final double impuesto = 0.15;
            if (duracionLlamada < 5) {
                precio = duracionLlamada * 100;
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 5 && duracionLlamada <= 8) {
                precio = 500 + ((duracionLlamada - 5) * 80);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 8 && duracionLlamada < 11) {
                precio = 500 + 340 + ((duracionLlamada - 8) * 70);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 10) {
                precio = 500 + 340 + 140 + ((duracionLlamada - 10) * 50);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            }
        } else {
            double precio = 0;
            final double impuesto = 0.10;
            if (duracionLlamada < 5) {
                precio = duracionLlamada * 100;
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 5 && duracionLlamada <= 8) {
                precio = 500 + ((duracionLlamada - 5) * 80);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 8 && duracionLlamada < 11) {
                precio = 500 + 340 + ((duracionLlamada - 8) * 70);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            } else if (duracionLlamada > 10) {
                precio = 500 + 340 + 140 + ((duracionLlamada - 10) * 50);
                precio = (precio + (precio*impuesto))/100;
                System.out.println("La llamada cuesta : " + precio + " euros");
            }
        }

    }
}
