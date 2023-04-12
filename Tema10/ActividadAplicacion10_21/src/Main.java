import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedWriter escritura = null;
        BufferedReader bre = null;
        FileInputStream flujo = null;
        Scanner sc = new Scanner(System.in);
        String contactos[] = new String[0];
        int opcion;
        boolean salir = false;
        do {
            menu();
            System.out.print("\nIntroduce la opcion que deseas: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    String texto;
                    System.out.println("1. Agregar Contacto\n");
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("agenda.txt"));
                        sc = new Scanner(br);
                        while (sc.hasNext()) {
                            String contacto = sc.nextLine();
                            contactos = Arrays.copyOf(contactos, contactos.length + 1);
                            contactos[contactos.length - 1] = contacto;
                        }
                        //
                        System.out.println(Arrays.toString(contactos));
                        do {
                            sc = new Scanner(System.in);
                            System.out.print("Introduce el nombre del contacto: ");
                            texto = sc.next();
                            System.out.print("Introduce el numero de telefono del contacto: ");
                            texto = texto + " " + sc.next();
                        } while (existeFirma(contactos, texto));
                        //
                        escritura = new BufferedWriter(new FileWriter("agenda.txt", true));
                        sc = new Scanner(System.in);
                        escritura.write(texto);
                        escritura.newLine();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        if (escritura != null) {
                            try {
                                escritura.close();
                            } catch (IOException e) {
                                System.out.println(e);
                            }
                        }
                    }
                    break;
                case 2:

                    break;
                case 3:
                    String agendaCompleta = "";
                    try {
                        bre = new BufferedReader(new FileReader("agenda.txt"));
                        String linea = bre.readLine();
                        while (linea != null) {
                            agendaCompleta = agendaCompleta + linea + '\n';
                            linea = bre.readLine();
                        }
                        System.out.println("Nombre | Numero");
                        System.out.println(agendaCompleta);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        if (bre != null) {
                            try {
                                bre.close();
                            } catch (IOException e) {
                                System.out.println(e);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        } while ((opcion < 1 || opcion > 4) || !salir);
    }

    public static void menu() {
        System.out.println("\n------------------------------");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Buscar Contacto");
        System.out.println("3. Mostrar todos los contactos");
        System.out.println("4. Salir");
        System.out.println("------------------------------");
    }

    public static boolean existeFirma(String[] contactos, String contactoNuevo) {
        boolean existe = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].equals(contactoNuevo)) {
                existe = true;
            }
        }
        return existe;
    }
}