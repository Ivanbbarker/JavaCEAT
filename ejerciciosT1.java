package ejerciciosResueltos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author java
 */

public class ejerciciosT1 {

    public static void main(String[] args) {

        ejercicio1_20();

    }

    /**
     * ENUNCIADO: -Un economista te ha encargado un programa para realizar
     * cálculos con el IVA. La aplicación debe solicitar la base imponible y el
     * IVA que se debe aplicar. Muestra en pantalla el importe correspondiente
     * al IVA y al total
     */
    public static void ejercicio1_11() {

        Scanner sc = new Scanner(System.in);

        final double IVA = 21;
        double importeTotal, baseImponible;

        System.out.println("Escribe el importe del producto (€) : ");
        baseImponible = sc.nextDouble();
        importeTotal = baseImponible + (baseImponible * (IVA / 100));
        System.out.println("El precio total es: " + importeTotal + "€");

    }

    public static void ejercicio1_12() {

        Scanner sc = new Scanner(System.in);

        final int MUL = 7;
        int num, comprobante;

        System.out.print("Escribe el numero a comprobar: ");
        num = sc.nextInt();
        comprobante = MUL - num % MUL;
        System.out.print("Es necesario sumar: " + comprobante);

    }

    public static void ejercicio1_14() {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double base, altura;

        System.out.print("Escribe la base del triángulo(cm): ");
        base = sc.nextDouble();
        System.out.print("Escribe la altura del triángulo(cm): ");
        altura = sc.nextDouble();
        System.out.println("El área del triangulo es " + (base * altura) / 2 + "cm");
    }

    public static void ejercicio1_15() {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double a, b, c, x, y;

        System.out.print("Escribe el valor del coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Escribe el valor del coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Escribe el valor del coeficiente c: ");
        c = sc.nextDouble();
        System.out.print("Escribe el valor de la incognita x: ");
        x = sc.nextDouble();

        y = (a * (x * x)) + (b * x) + c;

        System.out.println("El valor de Y para la ecuacion es: " + y);
        System.out.println(y + " = (" + a + " * " + x + "^2) + (" + b + " * " + x + ") + " + c);

    }

    public static void ejercicio1_16() {

        Scanner sc = new Scanner(System.in);

        int segundos, horas, minutos;

        System.out.print("Escribe el numero de segundos: ");
        segundos = sc.nextInt();
        horas = (segundos/3600);
        minutos = (segundos/60);
        System.out.println(segundos + " son "+ minutos + " minutos");
        System.out.println(segundos+ " son "+ horas + " horas");

    }
    
    public static void ejercicio1_17(){
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double disCent, disMil, disMet;
        double conversionM, conversionMil, distanciaTotal;
        
        System.out.print("Escribe la primera distancia (en mm): ");
        disMil = sc.nextDouble();
        System.out.print("Escribe la segunda distancia (en cm): ");
        disCent = sc.nextDouble();
        System.out.print("Escribe la tercera distancia (en m): ");
        disMet = sc.nextDouble();    
        
        conversionM = disMet * 100 ;
        conversionMil = disMil / 10;
        
        distanciaTotal = conversionMil + disCent + conversionM;
        
        System.out.println("La distancia total introducida es de  "+ distanciaTotal +" cm");
        
    
    }
    
    public static void ejercicio1_18(){
    
        Scanner sc = new Scanner(System.in);
        
        final int patasHormigas = 6, patasCochinillas = 14, patasArañas = 8;
        
        int numeroCochinillas, numeroHormigas, numeroArañas, numeroPatasTotal;
        
        System.out.print("Introduce el numero de hormigas capturadas: ");
        numeroHormigas = sc.nextInt();
        System.out.print("Introduce el numero de arañas capturadas: ");
        numeroArañas = sc.nextInt();
        System.out.print("Introduce el numero de cochinillas capturadas: ");
        numeroCochinillas = sc.nextInt();
        
        numeroPatasTotal = (numeroHormigas * patasHormigas ) + (numeroArañas * patasArañas) + (numeroCochinillas * patasCochinillas);
        
        System.out.println("\nEl numero total de patas de las capturas de hoy es: " + numeroPatasTotal +" patas.");
        System.out.println("\nEl numero de patas de Hormigas es: " + (numeroHormigas * patasHormigas ) + " patas.");
        System.out.println("El numero de patas de Araña es: " + (numeroArañas * patasArañas) + " patas.");
        System.out.println("El numero de patas de Cochinilla es: " + (numeroCochinillas * patasCochinillas) + " patas.");
    
    }
    
    public static void ejercicio1_19(){
    
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double entradaAdulto = 20 , entradaInfantil = 15.50 , importeTotal ;
        int nEntradasAdulto, nEntradasInfantil;
        
        System.out.print("Introduce el numero de entradas de Adulto que deseas: ");
        nEntradasAdulto = sc.nextInt();
        System.out.print("Introduce el numero de entradas de Infantil que deseas: ");
        nEntradasInfantil = sc.nextInt();  
        
        importeTotal = (nEntradasAdulto * entradaAdulto) + (nEntradasInfantil * entradaInfantil);    
        
        importeTotal = importeTotal >= 100 ? (importeTotal-(importeTotal*0.05)) : importeTotal;
        
        System.out.println("El precio de las entradas es de "+ importeTotal +" €");
        
        System.out.println("El precio de las "+ nEntradasAdulto + " es de "+ (nEntradasAdulto * entradaAdulto) +" €");
        System.out.println("El precio de las "+ nEntradasInfantil + " es de "+ (nEntradasInfantil * entradaInfantil) +" €");
        
        
    }
    
    public static void ejercicio1_20(){
    
       Scanner sc = new Scanner(System.in);
       sc.useLocale(Locale.US);
       
       double raiz = 0.5, numRaiz;
       
       System.out.print("Escribe un numero Real: ");
       int num = sc.nextInt();
       
       //numRaiz = num < 0 ? 0 : (num^raiz) ;
       
       System.out.println("La raiz cuadrada de "+ num + " es igual a "+ numRaiz );
        
        
    }
            

}
