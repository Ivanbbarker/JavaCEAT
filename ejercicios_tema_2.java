package ejerciciosResueltos;

import java.util.Scanner;

/**
 *
 * @author ivanbbarker
 */
public class ejercicios_tema_2 {
    
    public static void main(String[] args) {
        
       interfazEjercicio(obtenerEjercicio());
        
    }
    
    public static void ejercicio2_1(){
     
        Scanner sc = new Scanner(System.in);
        
        int numero;
        System.out.print("Escribe el numero que deseas comprobar: ");
        numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero "+ numero +" es par.");
        } else {
            System.out.println("El numero "+ numero +" es impar.");
        }
        
    
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

        } while (nEjercicio <= 0  && nEjercicio > 15);

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
            case 1:
                ejercicio2_1();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
            case 10:
               
                break;
            case 11:
                
                break;
            case 12:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
}
