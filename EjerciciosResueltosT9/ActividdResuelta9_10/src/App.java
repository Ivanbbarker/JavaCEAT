import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ComparaEnterosInverso c = new ComparaEnterosInverso();

        Integer [] a = new Integer[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(a, c);

        System.out.println(Arrays.toString(a));


    }
}
