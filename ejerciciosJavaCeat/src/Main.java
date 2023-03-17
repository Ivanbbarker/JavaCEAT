import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        CuentaCorriente cuentaCorriente[] = new CuentaCorriente[0];

        do {
            mostrarMenu();
            int opcion = 0;
            do {
                System.out.print("\nIntroduce la opcion que deseas realizar: ");
                opcion = new Scanner(System.in).nextInt();
            } while (opcion < 0 && opcion > 6);
            switch (opcion) {
                case 1:
                    cuentaCorriente = Arrays.copyOf(cuentaCorriente, cuentaCorriente.length + 1);
                    cuentaCorriente[cuentaCorriente.length - 1] = darDeAlta();
                    System.out.println(Arrays.toString(cuentaCorriente));
                    break;
                case 2:
                    ingresarDinero(cuentaCorriente);
                    break;
                case 3:
                    egresarDinero(cuentaCorriente);
                    break;
                case 4:
                    mostrarDatosUsuarios(cuentaCorriente);
                    break;
                case 6:
                    salir = true;
                    break;
                case 5:
                    mostrarDatosUsuariosTrabajadores(cuentaCorriente);
                    break;
            }
        } while (!salir);
    }

    public static void mostrarDatosUsuarios(CuentaCorriente[] cuentaCorriente) {
        String numeroCuentaActual;
        String salida;
        do {
            System.out.print("Introduce tu numero de cuenta: ");
            numeroCuentaActual = new Scanner(System.in).next();
        } while (comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente) == -1);
        cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)].mostrarInformacion();
    }
    

    public static void mostrarDatosUsuariosTrabajadores(CuentaCorriente[] cuentaCorriente) {
        int numeroUsuarioLaboral; 
        do {
            System.out.println("Introduce tu contraseña de usuario: ");
            numeroUsuarioLaboral = new Scanner(System.in).nextInt();
        } while (numeroUsuarioLaboral != 123456789);
        for (int i = 0; i < cuentaCorriente.length; i++) {
            System.out.println();
            cuentaCorriente[i].mostrarInformacion();
        }
        
    }

    public static void egresarDinero(CuentaCorriente[] cuentaCorriente) {
        String numeroCuentaActual;
        String salida;
        do {
            System.out.println("Introduce tu numero de cuenta: ");
            numeroCuentaActual = new Scanner(System.in).next();
        } while (comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente) == -1);
        String usuario = cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)]
                .getNombre();
        System.out.println("Bienvenido al sistema de egreso de cuenta corriente " + usuario + "\n\n");
        System.out.print("Cuanto dinero deseas egresar: ");
        int dineroEgresar = new Scanner(System.in).nextInt();
        cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)].egreso(dineroEgresar);
        System.out.println("Egreso realizado correctamente");
        System.out.println("Desea ver su saldo actual ?");
        salida = new Scanner(System.in).next();
        if ((salida.charAt(0)) == ('S') || (salida.charAt(0)) == ('s')) {
            System.out.println("Su saldo es: "
                    + cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)].getSaldo());
        }
    }

    public static void ingresarDinero(CuentaCorriente[] cuentaCorriente) {
        String numeroCuentaActual;
        String salida;
        do {
            System.out.println("Introduce tu numero de cuenta: ");
            numeroCuentaActual = new Scanner(System.in).next();
        } while (comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente) == -1);
        String usuario = cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)]
                .getNombre();
        System.out.println("Bienvenido al sistema de ingreso de cuenta corriente " + usuario + "\n\n");
        System.out.println("Procedemos a ingresar...");
        System.out.print("Cuanto dinero deseas ingresar: ");
        int dineroIngresar = new Scanner(System.in).nextInt();
        cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)].ingreso(dineroIngresar);
        System.out.println("Ingreso realizado correctamente");
        System.out.println("Desea ver su saldo actual ?");
        salida = new Scanner(System.in).next();
        if ((salida.charAt(0)) == ('S') || (salida.charAt(0)) == ('s')) {
            System.out.println("Su saldo es: "
                    + cuentaCorriente[comprobarNumeroCuenta(numeroCuentaActual, cuentaCorriente)].getSaldo());
        }
    }

    private static int comprobarNumeroCuenta(String numeroCuentaActual, CuentaCorriente[] cuentaCorriente) {
        int encontrado = -1;
        for (int i = 0; i < cuentaCorriente.length; i++) {
            String numeroCuenta = cuentaCorriente[i].getNumeroCuenta();
            if (numeroCuentaActual.equals(numeroCuenta)) {
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
        System.out.println("5. Mostrar datos de usuarios ( SOLO TRABAJADORES )");
        System.out.println("6. Salir");
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
        c.setNumeroCuenta(doPassword());
        System.out.println("Tu numero de cuenta es: " + c.getNumeroCuenta() + "\n\n");
        return c;
    }

    public static String doPassword() {

        Random random = new Random();
        List result = new ArrayList();
        boolean upperCase = false;
        char[] numeros = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        char[] letras_mayusculas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'C', 'W', 'X', 'Y', 'Z' };
        for (int i = 0; i < 7; i++) {
            result.add(numeros[random.nextInt(numeros.length - 1)]);
        }
        result.add(letras_mayusculas[random.nextInt(letras_mayusculas.length - 1)]);
        return result.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
    }

}
