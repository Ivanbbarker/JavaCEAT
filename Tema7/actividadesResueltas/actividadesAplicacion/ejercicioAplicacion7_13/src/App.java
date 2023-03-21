public class App {
    public static void main(String[] args) throws Exception {
        Colores clor = new Colores();
        clor.añadirColores("marron");
        String[] coloresSalon = new String[5];
        coloresSalon = clor.getColoresAleatorios(coloresSalon.length);
        for (int i = 0; i < coloresSalon.length; i++) {
            System.out.println("Colores: " + coloresSalon[i]);
        }
    }
}
