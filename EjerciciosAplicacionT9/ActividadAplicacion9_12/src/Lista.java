import java.util.Arrays;

public class Lista implements Cola, Pila {

    String tabla[];

    public Lista() {
        tabla = new String[0];
    }

    void insertarPrincipio(String cadena) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = cadena;
    }

    void insertarFinal(String cadena) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = cadena;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
    }

    void insertar(int posicion, String cadena) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = cadena;
    }

    String eliminar(int indice){
        String eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }
    
    String get(int indice){
        String resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        return resultado;
    }

    int buscar(String cadena){
        int posicion = -1;
        for (int i = 0; i < tabla.length && posicion == -1; i++) {
            if (tabla[i].equals(cadena)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /* METODOS DE LA INTERFAZ COLA */

    public void encolar(String cadena){
        insertarFinal(cadena);
    }

    public String desencolar() {
        return eliminar(0);
    }

    /* METODOS DE LA INTERFAZ PILA */

    public void apilar(String cadena){
        insertarPrincipio(cadena);
    }

    public String desapilar() {
        return eliminar(tabla.length - 1);
    }


    public String toString() {
        return Arrays.deepToString(tabla);
    }


}