import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Supercola s = new Supercola();

        int opcion;
        boolean salir = false;
        

        do {
            menu();
            System.out.println("Introduce el numero de tu opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nOpcion: Encolar en cola1");
                    System.out.println("Introduce el numero que encolar: ");
                    int encole1 = sc.nextInt();
                    s.encolar1(encole1);
                    break;
                case 2:
                    System.out.println("\nOpcion: Encolar en cola2");
                    System.out.println("Introduce el numero que encolar: ");
                    int encole2 = sc.nextInt();
                    s.encolar2(encole2);
                    break;
                case 3:
                    System.out.println("\nOpcion: Desencolar en cola2");
                    System.out.println(s.desencolar1());
                    break;
                case 4:
                    System.out.println("\nOpcion: Desencolar en cola2");
                    System.out.println(s.desencolar2());
                    break;
                case 5:
                    salir = true;
                    break;
            }

        } while (!salir);

    }

    public static void menu() {
        System.out.println("\n1. Encolar en cola1");
        System.out.println("2. Encolar en cola2");
        System.out.println("3. Desencolar en cola1");
        System.out.println("4. Desencolar en cola2");
        System.out.println("5. Salir\n");
    }
}
