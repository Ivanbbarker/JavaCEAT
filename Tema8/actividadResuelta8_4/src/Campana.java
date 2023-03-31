public class Campana extends Instrumento{
    public Campana(){
        super();
    }
    @Override
    public void interpretar() {
        for (Nota nota : melodia) {
            switch (nota) {
                case DO:
                    System.out.println("DOONG ");
                    break;
                case RE:
                    System.out.println("DONG ");
                    break;
                case MI:
                    System.out.println("DIING ");
                    break;
                case FA:
                    System.out.println("DING ");
                    break;
                case SOL:
                    System.out.println("ding ");
                    break;
                case LA:
                    System.out.println("plong ");
                    break;
                case SI:
                    System.out.println("pling ");
                    break;
            }
        }
        System.out.println("");
    }
}
