public class Main {
    public static void main(String[] args) throws Exception {
        MarcaPaginas libro = new MarcaPaginas(0, 300);
        libro.mostrarInforcion();
        libro.incrementaPagina();
        libro.mostrarInforcion();
        libro.incrementaPagina();libro.incrementaPagina();libro.incrementaPagina();libro.incrementaPagina();
        libro.mostrarInforcion();
        libro.setPrincipio();
        libro.mostrarInforcion();
    }
}
