package tema5;

/**
 *
 * @author java
 */
public class ejercicio5_4 {

    public static int maximo(int t[]) {
        int max = t[0];
        for (int e : t) {
            if (e > max) {
                max = e;
            } else {
            }
        }
        return max;
    }
}
