package tema5;

/**
 *
 * @author java
 */
public class ejercicio5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int valores[] = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100 + 1);
        }
        int suma = 0;
        for (int valor : valores) {
            suma+= valor;
        }
        System.out.println("La suma de los valores es: "+suma);
    }

}
