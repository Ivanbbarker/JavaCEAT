package tema5;

import java.util.Arrays;
/**
 *
 * @author java
 */
public class ejercicio5_5 {
    public static void main(String[] args) {
        int n = 10, m = 10;
        
        int pares[] = llenarPares(m, n);
        System.out.println(Arrays.toString(pares));
    }
    
    public static int[] llenarPares(int longitud, int fin){
        int pares [] = new int[longitud]; 
        
        int i = 0;
        
        while(i < pares.length) {
            int num = (int) (Math.random()*fin+1);
            if (num % 2 == 0) {
                pares[i] = num;
                i++;
            }
        }
        Arrays.sort(pares);
        return pares;
    }
    
}
