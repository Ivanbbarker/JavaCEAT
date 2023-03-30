import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {

        Socio s1 = new Socio(3, "Anselmo", "11/07/2002");
        Socio s2 = new Socio(1, "Josefa", "21/11/2001");

        int resultado = s1.compareTo(s2);
        System.out.println(resultado);

        ComparaEdades c = new ComparaEdades();
        Comparator c1 = new ComparaEdades();
        Comparator c2 = c1.reversed();

        Socio[] t = new Socio[] {
                new Socio(2, "Ana", "07/12/1995"),
                new Socio(5, "Jorge", "20/01/2002"),
                new Socio(1, "Juan", "06/05/2004"),
        };

        Arrays.sort(t, c1);
        System.out.println(Arrays.deepToString(t));

        /*
         * Arrays.sort(t, new Comparator() {
         * public int compare(Object o1, Object o2) {
         * return ((Socio) o1).edad() - ((Socio)o2).edad();
         * }
         * });
         *
         * 
         * Arrays.sort(t, c2);
         * 
         */
    }
}
