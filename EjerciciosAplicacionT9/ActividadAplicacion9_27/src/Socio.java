import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Socio implements Comparable {
    int id;
    String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public int compareTo(Object o) {
        int resultado = Integer.compare(this.edad(), ((Socio)o).edad());
        if (resultado == 0) {
            resultado = nombre.compareTo(((Socio)o).nombre);
        }
        return resultado;
    }

    

    public String toString() {
        return "ID: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }

}
