import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Lista listo = new Lista();

        listo.insertarPrincipio("Hola");
        listo.insertarPrincipio("Mundo");
        listo.insertarPrincipio("Milagro");
        listo.insertarFinal("Joseph");

        System.out.println(listo.eliminar(0));
        System.out.println(listo.get(2));
        System.out.println(listo.toString());
        Arrays.deepToString(listo.tabla);
    }
}
