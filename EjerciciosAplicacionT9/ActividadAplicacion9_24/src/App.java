public class App {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista();

        for (int i = 0; i < 10 ; i++) { 
            l.insertarPrincipio(i);
        }

        System.out.println(l);

        l.ordenar();
        System.out.println(l);

        Comparar c = new Comparar();

        l.ordenar(c);
        System.out.println(l);

    }
}
