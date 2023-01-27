import java.util.Scanner;
import java.util.Random;


public class ejerciciosFinalesT2 {

  public static void main(String [] args) {
    
    
  }
  
  public static void ejercicio2_11(){
      
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el numero a comprobar ");
        int numeroComprobar = sc.nextInt();

        if (numeroComprobar < 0 || numeroComprobar < 10) {
            System.out.println("El numero no nes capicua.");
        } else {
            if (numeroComprobar > 9 && numeroComprobar < 100) {
                int unidades, decenas;
                unidades = numeroComprobar % 10;
                decenas = numeroComprobar % 100 / 10;
                int numeroComprobacion = unidades*10 + decenas;
                if (numeroComprobacion == numeroComprobar) {
                    System.out.println("El numero es Capicua");
                } else {
                    System.out.println("No es numero Capicua");
                }

            } else if (numeroComprobar > 99 && numeroComprobar < 1000) {
                int unidades, decenas, centenas;
                unidades = numeroComprobar % 10;
                decenas = numeroComprobar % 100 / 10;
                centenas = numeroComprobar % 1000 / 100;
                int numeroComprobacion = unidades*100 + decenas*10 + centenas;
                if (numeroComprobacion == numeroComprobar) {
                    System.out.println("El numero es Capicua");
                } else {
                    System.out.println("No es numero Capicua");
                }

            }
            else if (numeroComprobar > 999 && numeroComprobar < 10000) {
                int unidades, decenas, centenas, millares;
                unidades = numeroComprobar % 10;
                decenas = numeroComprobar % 100 / 10;
                centenas = numeroComprobar % 1000 / 100;
                millares = numeroComprobar % 10000 / 1000;
                int numeroComprobacion = unidades*1000 + decenas*100 + centenas*10 + millares;
                if (numeroComprobacion == numeroComprobar) {
                    System.out.println("El numero es Capicua");
                } else {
                    System.out.println("No es numero Capicua");
                }

            }

        }
    
    public static void ejercicio2_12(){
      
        Scanner sc = new Scanner(System.in);
        char letraDni = ' ';
        System.out.println("Escriba tu DNI:  ");
        int dni = sc.nextInt();
        int letra = dni % 23;
        switch (letra) {
            case 0 ->
                letraDni = 'T';
            case 1 ->
                letraDni = 'R';
            case 2 ->
                letraDni = 'W';
            case 3 ->
                letraDni = 'A';
            case 4 ->
                letraDni = 'G';
            case 5 ->
                letraDni = 'M';
            case 6 ->
                letraDni = 'Y';
            case 7 ->
                letraDni = 'F';
            case 8 ->
                letraDni = 'P';
            case 9 ->
                letraDni = 'D';
            case 10 ->
                letraDni = 'X';
            case 11 ->
                letraDni = 'B';
            case 12 ->
                letraDni = 'N';
            case 13 ->
                letraDni = 'J';
            case 14 ->
                letraDni = 'Z';
            case 15 ->
                letraDni = 'S';
            case 16 ->
                letraDni = 'Q';
            case 17 ->
                letraDni = 'V';
            case 18 ->
                letraDni = 'H';
            case 19 ->
                letraDni = 'L';
            case 20 ->
                letraDni = 'C';
            case 21 ->
                letraDni = 'K';
            case 22 ->
                letraDni = 'E';
        }
        System.out.println("Letra del DNI: " + letraDni);
        System.out.println("DNI: " + dni + "-" + letraDni); 
    }
    
    public static void ejercicio2_13(){
    
        double comidaDiaria, kilosAnimal;
        int numAnimales;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la cantidad diaria para comprar (en Kg): ");
        comidaDiaria = sc.nextDouble();
        System.out.print("Introduzca el numero de animales: ");
        numAnimales = sc.nextInt();
        System.out.print("Introduzca lo que come cada animal (en Kg)");
        kilosAnimal = sc.nextDouble();

        if (numAnimales == 0) {
            System.out.println("Si no hay animales, no hay que comprar comida.");
        } else if (comidaDiaria == 0) {
            System.out.println("No hay nada de comida comprada.");
        } else if (kilosAnimal == 0) {
            System.out.println("Los animales no pueden comer 0 Kg cada uno.");
        } else {
            if ((kilosAnimal * numAnimales) > comidaDiaria) {
                System.out.println("No hay suficiente comida para cada animal");
                double comidaPorAnimal = comidaDiaria / numAnimales;
                System.out.println("Les corresponde a cada animal " + comidaPorAnimal + " Kg de comida.");
            } else {
                double comidaPorAnimal = kilosAnimal;
                double comidaRestante = comidaDiaria - (kilosAnimal * numAnimales);
                System.out.println("A cada animal le corresponden " + comidaPorAnimal + " Kg de comida.");
                if (comidaRestante != 0) {
                    System.out.println("Sobran " + comidaRestante + " Kg de comida.");
                }
            }

        }
    }
    
    public static void ejercicio2_14(){
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero a escribir: ");
        int numero = sc.nextInt();

        if (numero >= 0 && numero < 100) {

            if (numero >= 0 && numero < 10) {

                switch (numero) {
                    case 0 ->
                        System.out.print("Cero");
                    case 1 ->
                        System.out.print("Uno");
                    case 2 ->
                        System.out.print("Dos");
                    case 3 ->
                        System.out.print("Tres");
                    case 4 ->
                        System.out.print("Cuatro");
                    case 5 ->
                        System.out.print("Cinco");
                    case 6 ->
                        System.out.print("Seis");
                    case 7 ->
                        System.out.print("Siete");
                    case 8 ->
                        System.out.print("Ocho");
                    case 9 ->
                        System.out.print("Nueve");
                }

            } else if (numero >= 10 && numero < 31) {
                switch (numero) {
                    case 10 ->
                        System.out.print("Diez");
                    case 11 ->
                        System.out.print("Once");
                    case 12 ->
                        System.out.print("Doce");
                    case 13 ->
                        System.out.print("Trece");
                    case 14 ->
                        System.out.print("Catorce");
                    case 15 ->
                        System.out.print("Quince");
                    case 16 ->
                        System.out.print("Dieciseis");
                    case 17 ->
                        System.out.print("Diecisiete");
                    case 18 ->
                        System.out.print("Dieciocho");
                    case 19 ->
                        System.out.print("Diecinueve");
                    case 20 ->
                        System.out.print("Veinte");
                    case 21 ->
                        System.out.print("Veintiuno");
                    case 22 ->
                        System.out.print("Veintidos");
                    case 23 ->
                        System.out.print("Veintitres");
                    case 24 ->
                        System.out.print("Veinticuatro");
                    case 25 ->
                        System.out.print("Veinticinco");
                    case 26 ->
                        System.out.print("Veintiseis");
                    case 27 ->
                        System.out.print("Veintisiete");
                    case 28 ->
                        System.out.print("Veintiocho");
                    case 29 ->
                        System.out.print("Veintinueve");
                    case 30 ->
                        System.out.print("Treinta");

                }

            } else if (numero > 30 && numero < 100) {
                int decenas, unidades;
                unidades = numero % 10;
                decenas = numero % 100 / 10;
                switch (decenas) {

                    case 3 ->
                        System.out.print("Treinta");
                    case 4 ->
                        System.out.print("Cuarenta");
                    case 5 ->
                        System.out.print("Cincuenta");
                    case 6 ->
                        System.out.print("Sesenta");
                    case 7 ->
                        System.out.print("Setenta");
                    case 8 ->
                        System.out.print("Ochenta");
                    case 9 ->
                        System.out.print("Noventa");

                }

                switch (unidades) {
                    case 0 ->
                        System.out.print("");
                    case 1 ->
                        System.out.print(" y uno");
                    case 2 ->
                        System.out.print(" y dos");
                    case 3 ->
                        System.out.print(" y tres");
                    case 4 ->
                        System.out.print(" y cuatro");
                    case 5 ->
                        System.out.print(" y cinco");
                    case 6 ->
                        System.out.print(" y seis");
                    case 7 ->
                        System.out.print(" y siete");
                    case 8 ->
                        System.out.print(" y ocho");
                    case 9 ->
                        System.out.print(" y nueve");
                }

            } else {
                System.out.println("El numero no esta comprendido entre 0 y 99.");
            }
        }
    }
    
    public static void ejercicio2_15(){
      Scanner sc = new Scanner(System.in);
        
        double base, altura;
        
        System.out.print("Escribe la base del triangulo: ");
        base = sc.nextDouble();
        if(base > 0){
            System.out.print("Escribe la altura del triangulo: ");
            altura = sc.nextDouble();
            if(altura > 0){
                double areaTriangulo = base*altura/2;
                System.out.println("El areal del triangulo es "+areaTriangulo);
            }
            else{
                System.out.println("La altura del triangulo no puede ser NEGATIVA");
            }
        }else{
            System.out.println("La base del triangulo no puede ser NEGATIVA.");
        }
    }
    
    public static void ejercicio2_16(){
    
        Scanner sc = new Scanner(System.in);
        int numero = 0, valorAbsoluto;
        System.out.print("Escribe un numero que hacer valor absoluto: ");
        numero = sc.nextInt();
        valorAbsoluto = numero < 0 ? -(numero): numero ;
        System.out.println("El numero "+numero+ " en valor absoluto es "+valorAbsoluto);
        
      }
    
    public static void ejercicio2_17(){
      Scanner sc = new Scanner(System.in);

        System.out.println("JUEGO DE LA SUMA");

        int numero1, numero2, numeroJugador;
        Random ran = new Random();
        numero1 = ran.nextInt(99) + 1;
        numero2 = ran.nextInt(99) + 1;

        System.out.println("Los numeros son: " + numero1 + " y " + numero2);
        System.out.println("Cual es la suma...");
        numeroJugador = sc.nextInt();
        if (numeroJugador == (numero1 + numero2)) {
            System.out.println("Acertaste!!!");
        } else {
            System.out.println("Has fallado....");
        }

    }
    
    public static void ejercicio2_18(){
     
        Scanner sc = new Scanner(System.in);

        System.out.println("JUEGO DE LA SUMA");

        int numero1, numero2, numeroJugador, controladorOperacion;
        Random ran = new Random();
        numero1 = ran.nextInt(99) + 1;
        numero2 = ran.nextInt(99) + 1;
        controladorOperacion = ran.nextInt(3) + 1;

        System.out.println("Los numeros son: " + numero1 + " y " + numero2);

        switch (controladorOperacion) {

            case 1 -> {
                System.out.println("Realiza la SUMA (+)");
                numeroJugador = sc.nextInt();
                System.out.println("");

                if (numeroJugador == (numero1 + numero2)) {
                    System.out.println("Acertaste!!!");
                } else {
                    System.out.println("Has fallado....");
                }
            }

            case 2 -> {
                System.out.println("Realiza la RESTA (-)");
                numeroJugador = sc.nextInt();
                System.out.println("");

                if (numeroJugador == (numero1 - numero2)) {
                    System.out.println("Acertaste!!!");
                } else {
                    System.out.println("Has fallado....");
                }
            }

            case 3 -> {
                System.out.println("Realiza la MULTIPLICACION (*)");
                numeroJugador = sc.nextInt();
                System.out.println("");

                if (numeroJugador == (numero1 * numero2)) {
                    System.out.println("Acertaste!!!");
                } else {
                    System.out.println("Has fallado....");
                }
            }

        }
    }
    
    public static void ejercicio2_19(){
       Scanner sc = new Scanner(System.in);
       
        double grados;
        System.out.println("Escribe el numero de Grados: ");
        grados = sc.nextDouble();

        if (grados > 360 || grados < 0) {
            double nuevoGrado = grados % 360;
            double radianesEq = (nuevoGrado * Math.PI) / 180 ;
            System.out.println("Grados = "+nuevoGrado+"("+grados+")" + " es equivalente a "+ "Rad = "+radianesEq);
        } else {
            double radianesEq = (grados * Math.PI) / 180 ;
            System.out.println("Grados = "+grados+ " es equivalente a "+ "Rad = "+radianesEq);
        }
    }
    
  }

}
