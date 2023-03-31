import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {

        ComparaEdades cE = new ComparaEdades();
        ComparaNombres cN = new ComparaNombres();
    
        Socio[] t = new Socio[] {
                new Socio(2, "Ana", "21/01/2001"),
                new Socio(5, "zorge", "20/01/2001"),
                new Socio(1, "Juan", "22/01/2001"),
        };

        Arrays.sort(t, cN);
        System.out.println(Arrays.deepToString(t));

    }
}
