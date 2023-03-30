import java.util.Comparator;

public class ComparaNombres implements Comparator {

    @Override
        public int compare(Object o1, Object o2) {
            return ((Futbolista) o1).nombre.compareTo(((Futbolista) o2).nombre);
        }

}
