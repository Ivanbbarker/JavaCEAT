public class Futbolista implements Comparable {
    String dni;
    String nombre;
    int edad;
    int nGoles;

    Futbolista(){}

    Futbolista(String dni, String nombre, int edad, int nGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nGoles = nGoles;
    }

    public boolean equals(Futbolista ob1) {
        if (dni == ob1.dni) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        int resultado = Integer.compare(this.edad, ((Futbolista)o).edad);
        if (resultado == 0) {
            resultado = nombre.compareTo(((Futbolista)o).nombre);
        }
        return resultado;
    }




    public String toString() {
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad + " Numero de Goles: "+ nGoles + "\n";
    }


}