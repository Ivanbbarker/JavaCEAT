import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {

        ComparaEdades c1 = new ComparaEdades();
    
        Socio[] t = new Socio[] {
                new Socio(2, "Ana", "21/01/2001"),
                new Socio(5, "Jorge", "20/01/2001"),
                new Socio(1, "Juan", "22/01/2001"),
        };

        Arrays.sort(t, c1);
        System.out.println(Arrays.deepToString(t));

    }
}
