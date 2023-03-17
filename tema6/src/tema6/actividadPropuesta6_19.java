package tema6;

import java.util.Scanner;

public class actividadPropuesta6_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto a continuacion: ");
        String cadena = sc.nextLine();
        String res = "";
        do {
            System.out.println("Desea remplazar alguna palabra(s/n)");
            res = sc.next();
            if (res.toLowerCase().equals("s")) {
                cadena = remplazar(cadena, sc);
                System.out.println(cadena);
            }
            System.out.print("Desea rsalir del programa(s/n): ");
            res = sc.next();
        } while (res.toLowerCase().equals("n"));

    }

    public static String remplazar(String cadena, Scanner sc) {
        System.out.print("Que palabra desea remplazar: ");
        String palabraRemplazar = sc.next();
        System.out.print("Por que palabra la deberiamos remplazar: ");
        String palabraRemplazadaPor = sc.next();
        if (cadena.indexOf(palabraRemplazar) == -1) {
            System.out.println("No se encuentra dicha palabra en el texto");
        } else {
            cadena = cadena.replaceAll(palabraRemplazar, palabraRemplazadaPor);
        }
        return cadena;
    }
