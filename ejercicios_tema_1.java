
package ejerciciosResueltos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ivanbbarker
 */
public class ejercicios_tema_1 {

    public static void main(String[] args) {

        interfazEjercicio(obtenerEjercicio());
        
    }

    /**
     * Metodo que resuelve el ejercicio 1.4 del libro Programacion(2021) de la
     * plataforma paraninfo ebooks
     *
     */
    public static void ejercicio_3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu edad: ");
        int edad = sc.nextInt();
        System.out.println("El proximo año tu edad será " + ++edad + " años. ");

    }

    /**
     * Metodo que resuelve el ejercicio 1.4 del libro Programacion(2021) de la
     * plataforma paraninfo ebooks
     *
     */
    public static void ejercicio_4() {
        Scanner sc = new Scanner(System.in);

        int añoActual, añoNacimiento;
        System.out.print("Escribe el año actual: ");
        añoActual = sc.nextInt();
        System.out.print("Escribe tu año de nacimiento: ");
        añoNacimiento = sc.nextInt();

        System.out.println("Tu edad es " + (añoActual - añoNacimiento) + "  años.");

    }

    /**
     * Metodo que resuelve el ejercicio 1.4 del libro Programacion(2021) de la
     * plataforma paraninfo ebooks
     *
     */
    public static void ejercicio_5() {
        short numero = 32767;

        System.out.println("El valor máximo para short es: " + numero);
        System.out.println("El valor mínimo para short es: " + ++numero);

    }

    public static void ejercicio_6() {
        Scanner sc = new Scanner(System.in);

        int nota1, nota2;
        double media;

        System.out.print("Escribe el valor de la primera nota: ");
        nota1 = sc.nextInt();
        System.out.print("Escribe el valor de la segunda nota: ");
        nota2 = sc.nextInt();
        media = (nota1 + nota2) / 2;
        System.out.println("La nota media de las notas " + nota1 + " y " + nota2 + " es: " + media);

    }

    public static void ejercicio_7() {
        Scanner sc = new Scanner(System.in);

        double radio, area, longitud;

        System.out.println("Escribe el radio de la circunferencia: ");
        radio = sc.nextDouble();
        area = Math.PI * (radio * radio);
        longitud = (2 * Math.PI) * radio;
        System.out.println("El area de la circunferencia es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);

    }

    public static void ejercicio_8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe la edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;
        System.out.println("Mayoria de edad: " + mayorEdad);

    }

    public static void ejercicio_9() {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("--- PROGRAMA PAR/IMPAR ---");

        System.out.print("Escribe un numero a evaluar: ");
        numero = sc.nextInt();
        boolean esPar = (numero % 2 == 0);

        System.out.println("¿Es par? : " + esPar);

    }

    public static void ejercicio_10() {
        Scanner sc = new Scanner(System.in);

        boolean llueve, irBiblioteca, finalizarTareas, salir;
        System.out.print("¿Está lloviendo?(true o false): ");
        llueve = sc.nextBoolean();
        System.out.print("¿Has finalizado tus tareas?(true o false): ");
        finalizarTareas = sc.nextBoolean();
        System.out.print("¿Necesitas ir a la biblioteca?(true o false): ");
        irBiblioteca = sc.nextBoolean();
        salir = !llueve && finalizarTareas || irBiblioteca;
        System.out.println("¿Puedes salir?: " + salir);

    }

    public static void ejercicio_11() {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- PROGRAMA ADMINISTRACION VENTAS ---");

        final double PRECIO_MANZANAS = 2.35;
        final double PRECIO_PERAS = 1.95;

        int ventasManzanasS1, ventasManzanasS2, ventasPerasS1, ventasPerasS2;
        double totalM, totalP, totalGlobal;

        System.out.println("--- MANZANAS ---");
        System.out.print("Numero de ventas de manzanas para el Primer Semestre: ");
        ventasManzanasS1 = sc.nextInt();
        System.out.print("Numero de ventas de manzanas para el Segundo Semestre: ");
        ventasManzanasS2 = sc.nextInt();

        System.out.println("--- PERAS ---");
        System.out.print("Numero de ventas de peras para el Primer Semestre: ");
        ventasPerasS1 = sc.nextInt();
        System.out.print("Numero de ventas de peras para el Segundo Semestre: ");
        ventasPerasS2 = sc.nextInt();

        totalM = (ventasManzanasS1 + ventasManzanasS2) * PRECIO_MANZANAS;
        totalP = (ventasPerasS1 + ventasPerasS2) * PRECIO_PERAS;
        totalGlobal = totalM + totalP;

        System.out.println(" \nEl impore total de las manzanas es: " + totalM + "€");
        System.out.println("El impore total de las peras es: " + totalP + "€");
        System.out.println("El impore total de las manzanas es: " + totalGlobal + "€");

    }

    public static void ejercicio_12() {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- VALOR ABSOLUTO ---");
        System.out.print("Escribe un numero: ");
        int num = sc.nextInt();
        int valorAbs = num < 0 ? -1 * num : num;
        System.out.println("El valor absoluto de " + num + " es " + valorAbs);
    }

    public static void ejercicio_13() {

        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3;
        double notaMedia;

        System.out.print("Nota del primer timestre: ");
        nota1 = sc.nextInt();
        System.out.print("Nota del segundo timestre: ");
        nota2 = sc.nextInt();
        System.out.print("Nota del tercer timestre: ");
        nota3 = sc.nextInt();

        notaMedia = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("La nota media del curso es: " + notaMedia);
        System.out.println("Nota del boletin " + (int) notaMedia);

    }

    public static void ejercicio_14() {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int redondeo;
        double num;

        System.out.print("Escribe el numero que desea redondear: ");
        num = sc.nextDouble();
        redondeo = (int) (num + 0.5);

        System.out.println(num + " redondeado es igual a " + redondeo);
    }

    /**
     * Metodo que devuelve el numero del ejercicio que se desea resolver
     *
     * @return nEjercicio, numero del ejercicio que
     */
    public static int obtenerEjercicio() {
        Scanner sc = new Scanner(System.in);
        int nEjercicio = 0;

        do {

            System.out.print("Escribe el ejercicio que deseas resolver: ");
            nEjercicio = sc.nextInt();

        } while (nEjercicio < 2 && nEjercicio > 15);

        return nEjercicio;
    }

    /**
     * Metodo que ejecuta mediante un switch la resolucion de los ejercicios
     * segun los criterios de evaluación del código.
     *
     * @param nEjercicio
     */
    public static void interfazEjercicio(int nEjercicio) {
        switch (nEjercicio) {
            case 3:
                ejercicio_3();
                break;
            case 4:
                ejercicio_4();
                break;
            case 5:
                ejercicio_5();
                break;
            case 6:
                ejercicio_6();
                break;
            case 7:
                ejercicio_7();
                break;
            case 8:
                ejercicio_8();
                break;
            case 9:
                ejercicio_9();
                break;
            case 10:
                ejercicio_10();
                break;
            case 11:
                ejercicio_11();
                break;
            case 12:
                ejercicio_12();
                break;
            case 13:
                ejercicio_13();
                break;
            case 14:
                ejercicio_14();
                break;
            default:
                throw new AssertionError();
        }
    }
}
