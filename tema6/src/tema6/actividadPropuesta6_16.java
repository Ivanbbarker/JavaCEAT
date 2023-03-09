package tema6;

import java.util.Arrays;
import java.util.Scanner;

public class actividadesPropuestas6_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        String[] agenda = new String[0];
        do {
            visualizarMenu();
            opcion = opcion(sc);
            switch (opcion) {
                case 1:
                    agenda = crearAgenda(agenda, sc);
                    salir(sc);
                    break;
                case 2:
                    if (agenda.length == 0) {
                        System.out.println("La agenda se encuentra vacía, primero pase por la opcion 1.");
                        break;
                    } else {
                        buscarContacto(agenda, sc);
                        salir(sc);
                        break;
                    }

                case 3:
                    mostrarContactos(agenda);
                    salir(sc);
                    break;
            }
            
        } while (!salir);
    }

    public static boolean salir(Scanner sc) {
        System.out.println("Desea salir del programa (true/false): ");
        boolean salir = sc.nextBoolean();
        return salir;
    }

    public static int opcion(Scanner sc) {
        System.out.println("\nSelecciona la opcion que desees: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static void visualizarMenu() {
        System.out.println("1.) Anadir un nuevo contacto(nombre : telefono).");
        System.out.println("2.) Buscar telefono. ");
        System.out.println("3.) Mostrar contactos. ");
    }

    public static String[] crearAgenda(String[] agenda, Scanner sc) {
        String res = "";
        String telefono;
        do {
            System.out.print("Introduce el nombre: ");
            String nombre = sc.next();
            do {
                System.out.print("Introduce el nro de telefono: ");
                telefono = sc.next();
                if (telefono.length() != 9) {
                    System.out.println("Introduzca un numero de 9 digitos.");
                }
            } while (telefono.length() != 9);
            agenda = Arrays.copyOf(agenda, agenda.length + 1);
            agenda[agenda.length - 1] = nombre.toLowerCase() + " : " + telefono;
            System.out.print("Desea introducir otro numero(s/n): ");
            res = sc.next();
        } while (!res.toLowerCase().equals("n"));
        return agenda;
    }

    public static void buscarContacto(String[] agenda, Scanner sc) {
        String res = "";
        do {
            System.out.print("Introduzca el nombre del contacto que desea buscar: ");
            String nombre = sc.next();
            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i].startsWith(nombre.toLowerCase())) {
                    System.out.println("El contacto es: " + agenda[i]);
                    break;
                }
            }
            System.out.print("Desea visualizar otro contacto(s/n): ");
            res = sc.next();
        } while (!res.toLowerCase().equals("n"));
    }

    public static void mostrarContactos(String[] agenda) {
        String [] agendaOrdenada = agenda;
        agendaOrdenada = ordenarStringAlfabeticamente(agendaOrdenada);
        System.out.println("Ordenando agenda...");
        for (int i = 0; i < agendaOrdenada.length; i++) {
            System.out.println(agendaOrdenada[i]);
        }
    }

    public static String[] ordenarStringAlfabeticamente(String[] agenda) {
        for (int i = 0; i < agenda.length - 1; i++) {
            for (int j = i + 1; j < agenda.length; j++) {
                if (agenda[i].compareTo(agenda[j]) > 0) {
                    String temporal = agenda[i];
                    agenda[i] = agenda[j];
                    agenda[j] = temporal;
                }
            }
        }
        return agenda;
    }
    
}
