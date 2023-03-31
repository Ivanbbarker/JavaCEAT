import java.util.Comparator;

public class ComparaEdades implements Comparator {

    @Override
    public int compare(Object ob1, Object ob2){
        if (((Socio)ob1).fechaNacimiento.isEqual(((Socio)ob2).fechaNacimiento)) {
            return 0;
        } else if (((Socio)ob1).fechaNacimiento.isAfter(((Socio)ob2).fechaNacimiento)) {
            return 1;
        } else {
            return -1;
        }
    }

}
