public class App {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista();

            l.insertarPrincipio("A");
            l.insertarPrincipio("B");
            l.insertarPrincipio("Z");
            l.insertarPrincipio("D");

        System.out.println(l);

        l.ordenar();
        System.out.println(l);


    }
}
