import java.util.Comparator;

public class ComparaNombres implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) {
        return -((Socio)o1).nombre.compareTo(((Socio)o2).nombre);
    }

}
