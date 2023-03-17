package tema5;

/**
 * Importamos la clase 'Arrays' y 'Scanner'
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa que simula una jugada a "La Primitiva", donde podremos elegir la
 * longitud de nuestro boleto (apuesta[]), cuyo boleto ganador
 * (primitivaGanador[]), se genera aleatoriamente entre [1 - 50] y los compara
 * uno a uno, mostrando los numeros comparados por pantalla, y realizando tanto
 * como un conteo de aciertos de nuestro boleto como un nuevo array con los
 * numeros que hemos acertado del boleto ganador
 *
 * @author java
 */
public class ejercicio5_6 {

    public static void main(String[] args) {
        int apuestaJugador[] = new int[pedirLongitudPrimitiva()];
        int primitivaGanadora[] = new int[apuestaJugador.length];
        rellenarApuesta(apuestaJugador, primitivaGanadora);
        System.out.print("\nNumeros de aciertos en la primitiva: " + primitiva(apuestaJugador, primitivaGanadora) + "\n");
    }

    /**
     * Este metodo realiza las comprobaciones de los numeros de nuestra apuesta
     * (apuesta[]) y del boleto ganador (combinacionGanadora[]), a la vez que
     * crea un nuevo array donde se guardan los numeros que una vez comprobados
     * son acertados, es decir iguales.
     *
     * @param apuesta
     * @param combinacionGanadora
     * @return aciertos
     */
    public static int primitiva(int apuesta[], int[] combinacionGanadora) {
        int aciertos = 0;
        /*Creamos un array de longitud [0] para ir 
        incrementandolo durante la ejecucion*/
        int arrayConAciertos[] = new int[0];
        System.out.print("\n\n---- COMPROBACION DE PRIMITIVA ----");
        /*Utilizamos el for() para recorrer el array del boleto ganador
        (combinacionGanadora[])*/
        for (int i = 0; i < combinacionGanadora.length; i++) {
            System.out.println("\n\nComprobando numero de la posicion [" + i + "] ...\n");
            System.out.println("Numero de la apuesta: " + apuesta[i]);
            System.out.println("Numero de la combinacion: " + combinacionGanadora[i]);
            /*Realizamos la comprobacion de si el valor en la posicion [i] de ambos a*/
            if (apuesta[i] == combinacionGanadora[i]) {
                System.out.print("\nACIERTO!!\n");
                aciertos++;
                /*Modificamos el array auxiliar (arrayConAciertos[]) donde 
                almacenaremos los numeros acertados del usuario (apuesta[]) con 
                respecto del boleto ganador(combinacionGanadora[])*/
                arrayConAciertos = Arrays.copyOf(arrayConAciertos, arrayConAciertos.length + 1);
                arrayConAciertos[arrayConAciertos.length - 1] = apuesta[i];
            }
        }
        /*Imprimimos los valores pertinentes por pantalla y devolvemos
        el valor del numero de aciertos (aciertos)*/
        System.out.print("\n\nLos numeros premiados y apostados identicos son: " + Arrays.toString(arrayConAciertos));
        System.out.print("\n\n---- FIN DEL PROGRAMA DE COMPROBACION ----\n");
        return aciertos;
    }

    /**
     * Metodo que pide el tamaño del array de la apuesta del jugador o del
     * boleto ganador.
     *
     * @return numero
     */
    public static int pedirLongitudPrimitiva() {
        Scanner sc = new Scanner(System.in);
        /*Pedimos por pantalla la longitud que va a tener cualquiera 
        de nuestros dos arrays*/
        System.out.print("Introduce la longitud del array deseado: ");
        int numero = sc.nextInt();
        return numero;
    }

    /**
     * Metodo que rellena los pertinentes arrays dependiendo de los requisitos
     * del usuario, es decir, numeros introducidos por teclado mediante el
     * metodo rellenarArray() y para los numeros ganadores de la primitiva
     * rellenarPrimitiva() existentes en este mismo proyecto.
     *
     * @param apuesta
     * @param primitiva
     */
    public static void rellenarApuesta(int[] apuesta, int[] primitiva) {
        /* Imprimimos un mensaje por pantalla donde indicamos que proceso va a 
        realizarse y llamamos a la funcion rellenarArray() para el array del 
        boleto de la apuesta para el usuario (apuesta[])*/
        System.out.println("\nIntroduzca los numeros de su apuesta: \n");
        apuesta = rellenarArray(apuesta);
        /* Imprimimos un mensaje por pantalla donde indicamos que proceso va a 
        realizarse y llamamos a la funcion rellenarPrimitiva() para el array
         del boleto ganador (primitiva[])*/
        System.out.println("\n---- Rellenando numeros de la primitiva ---- \n");
        primitiva = rellenarPrimitiva(primitiva);
        System.out.println("---- PRIMITIVA GANADORA HECHA ----");

    }

    /**
     * Metodo que rellena el array de la apuesta del jugador, comprobando que
     * los numeros que se van introuciendo se encuentran dentro de los rangos [0
     * - 50]
     *
     * @param apuesta
     * @return apuesta
     */
    public static int[] rellenarArray(int apuesta[]) {

        Scanner sc = new Scanner(System.in);
        //Recorre desde el la posicion 0 hasta la ultima del array apuesta
        for (int i = 0; i < apuesta.length; i++) {
            /*Realizamos doWhile() para que lo repita siempre que los numeros 
            que introduzca el usuario no se encuentren dentro de los parametros*/
            do {
                System.out.print("Escribe el numero que desees: ");
                apuesta[i] = sc.nextInt();
                /*Si el numero esta fuera del rango volvemos a pedirlo con un
                mensaje adicional*/
                if (apuesta[i] < 0 || apuesta[i] > 50) {
                    System.out.println("Numero fuera de los parametros, \nParametros: [0 - 50]");
                }
            } while (apuesta[i] < 0 || apuesta[i] > 50);

        }
        return apuesta;
    }

    /**
     * Metodo que rellena el array de los numeros ganadores de la primitiva de
     * forma aleatoria con los numeros dentro de los rangos [0 - 50]
     *
     * @param primitivaGanadora
     * @return primitivaGanadora
     */
    public static int[] rellenarPrimitiva(int primitivaGanadora[]) {
        //Recorre desde el la posicion 0 hasta la ultima del array primitivaGanadora
        for (int i = 0; i < primitivaGanadora.length; i++) {
            /*Usamos Math.random() * final + inicial para generar 
            numeros aleatorios dentro del rango [1 -50]
             */
            primitivaGanadora[i] = (int) (Math.random() * 50 + 1);
        }
        /*Imprimimos el array de la primitiva ganadora para una mejor 
        visualizacion y comprension del programa
         */
        System.out.println("        " + Arrays.toString(primitivaGanadora));
        return primitivaGanadora;
    }

}
