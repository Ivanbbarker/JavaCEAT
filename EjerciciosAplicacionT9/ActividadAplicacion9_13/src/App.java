import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {

        ComparaEdad cE = new ComparaEdad();
        ComparaNombres cN = new ComparaNombres();
        ComparaDni cD = new ComparaDni();
        Futbolista[] f = new Futbolista[] {
                new Futbolista("12345678A", "Jose Luis", 23, 0),
                new Futbolista("23145678S", "Antonio", 20, 0),
                new Futbolista("36254788A", "Pepe", 53, 0),
                new Futbolista("96587423A", "Beatriz", 15, 0),
                new Futbolista("96521487A", "Rosalia", 32, 0),
        };

        Arrays.sort(f, cE);
        System.out.println(Arrays.deepToString(f));

        Arrays.sort(f, cN);
        System.out.println(Arrays.toString(f));

        Arrays.sort(f, cD);
        System.out.println(Arrays.toString(f));

    }
}
