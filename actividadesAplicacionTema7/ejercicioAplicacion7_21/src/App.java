public class App {
    public static void main(String[] args) throws Exception {
        Conjunto conjuncion = new Conjunto();
        Conjunto conjuncion2 = new Conjunto();
        conjuncion.add(1);
        conjuncion.add(2);
        conjuncion.add(3);
        conjuncion2.add(3);
        conjuncion2.add(4);
        conjuncion2.add(5);
        conjuncion.mostrar();
        conjuncion2.mostrar();
        conjuncion.add(conjuncion2);
        conjuncion.mostrar();
        conjuncion.eliminarConjunto(conjuncion2);
        conjuncion.mostrar();
    }
}
