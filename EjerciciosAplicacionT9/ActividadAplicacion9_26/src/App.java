import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista();

        Socio[] t = new Socio[] {
                new Socio(2, "Ana", "21/01/2003"),
                new Socio(5, "zorge", "20/01/2002"),
                new Socio(1, "Juan", "22/01/2001"),
        };

        l.insertarPrincipio(t[0]);
        l.insertarPrincipio(t[1]);
        l.insertarPrincipio(t[2]);


        System.out.println(l);

        Arrays.sort(l.tabla);
        System.out.println(l);
    }
}
