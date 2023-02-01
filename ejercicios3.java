
import java.util.Scanner;
import java.util.Random;

public class ejercicios3 {

public static void main (String [] args){

Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int contadorAciertos = 0;
        int numero1, numero2, resultado;
        do {

            numero1 = ran.nextInt(100) + 1;
            numero2 = ran.nextInt(100) + 1;

            System.out.print(numero1 + " + " + numero2 + " = ");
            resultado = sc.nextInt();

            contadorAciertos++;

        } while (resultado == numero1 + numero2);
        System.out.print("El numero de aciertos es: " + (contadorAciertos - 1));
    }
}
