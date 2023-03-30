public class App {
    public static void main(String[] args) throws Exception {
        Perro p = new Perro();
        Gato g = new Gato();

        g.voz();
        p.voz();

        p.vozDurmiendo();
        g.vozDurmiendo();
    
        Leon l = new Leon();
        l.voz();
        l.vozDurmiendo();
        Sonido.bostezo();
        
    }
}
