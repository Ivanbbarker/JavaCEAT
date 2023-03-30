import java.util.Comparator;

public class ComparaEdad implements Comparator {

    @Override
    public int compare(Object ob1, Object ob2) {
        return ((Futbolista)ob1).edad - ((Futbolista)ob2).edad;
    }

}
