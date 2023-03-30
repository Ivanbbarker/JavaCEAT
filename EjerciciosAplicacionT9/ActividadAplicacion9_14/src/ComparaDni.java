import java.util.Comparator;

public class ComparaDni implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Futbolista) o1).dni.compareTo(((Futbolista) o2).dni);
    }

}
