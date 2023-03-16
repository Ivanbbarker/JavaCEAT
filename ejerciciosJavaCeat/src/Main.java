import java.util.Arrays;
import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;

        do {
            mostrarMenu();
            int opcion = 0;
            CuentaCorriente cuentaCorriente[] = new CuentaCorriente[0];
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opcion valida"));
            } while (opcion < 0 && opcion > 4);

            switch (opcion) {
                case 1:
                    cuentaCorriente = Arrays.copyOf(cuentaCorriente, cuentaCorriente.length + 1);
                    cuentaCorriente[cuentaCorriente.length - 1] = darDeAlta();
                    break;
                case 2:
                    ingresarDinero(cuentaCorriente);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    salir = true;
                    break;
            }
        } while (!salir);
    }

    public static void ingresarDinero(CuentaCorriente[] cuentaCorriente) {
        int numeroCuentaActual;
        String salida;
        do {
            System.out.println("Introduce tu numero de cuenta: ");
            numeroCuentaActual = new Scanner(System.in).nextInt();
        } while (comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente) == -1);
        String usuario = cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)]
                .getNombre();
        System.out.println("Bienvenido al sistema de ingreso de cuenta corriente " + usuario);
        System.out.println("Procedemos a ingresar...");
        System.out.print("Cuanto dinero deseas ingresar: ");
        int dineroIngresar = new Scanner(System.in).nextInt();
        cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)].ingreso(dineroIngresar);
        System.out.println("Ingreso realizado correctamente");
        System.out.println("Desea ver su saldo actual ?");
        salida = new Scanner(System.in).next();
        if ((salida.charAt(0)) == ('S')) {
            System.out.println("Su saldo es: "
                    + cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)].getSaldo());
        }
    }

    private static int comprobarNumeroCuenta(int numeroCuentaActual, CuentaCorriente[] cuentaCorriente) {
        int encontrado = -1;
        for (int i = 0; i < cuentaCorriente.length; i++) {
            if (numeroCuentaActual == cuentaCorriente[i].getNumeroCuenta()) {
                encontrado = i;
                System.out.println("Cliente encontrado.\n");
            }
        }
        return encontrado;
    }

    public static void mostrarMenu() {
        System.out.println("1. Dar de Alta");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Sacar dinero");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Salir");
    }

    public static CuentaCorriente darDeAlta() {
        String opcion;
        CuentaCorriente c;
        System.out.print("Ingresa tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.print("Ingresa tu DNI: ");
        String dni = new Scanner(System.in).nextLine();
        c = new CuentaCorriente(nombre, dni);
        System.out.print("Ingresa el saldo que vas a ingresar por primera vez: ");
        Double saldo = new Scanner(System.in).nextDouble();
        c.setSaldo(saldo);
        do {
            opcion = JOptionPane.showInputDialog("Deseas salir del programa? (S/N)");
        } while ((opcion.charAt(0)) == ('S'));
        c.setNumeroCuenta(123456789);
        return c;
    }

}
