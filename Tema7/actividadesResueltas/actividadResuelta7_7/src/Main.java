public class Main {
    public static void main(String[] args) throws Exception {
        Texto t = new Texto(5);
        t.addPrincipio("HO");
        t.addPrincipio(";");
        t.addFinal("LÁ");
        t.addFinal('X');
        t.mostrar();
        System.out.println("Numero de vocales: "+ t.numVocales());
    }
}
