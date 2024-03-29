import java.util.Arrays;

public class Conjunto {

    Integer[] con;

    public Conjunto() {
        con = new Integer[0];
    }

    public int numeroElementos() {
        return con.length;
    }

    public void add(Integer elemento) {
        con = Arrays.copyOf(con, con.length + 1);
        con[con.length - 1] = elemento;
    }

    public Boolean add(Conjunto conjunto) {
        boolean terminado = false;
        for (int i = 0; i < conjunto.numeroElementos(); i++) {
            if (!pertenece(conjunto.con[i])) {
                con = Arrays.copyOf(con, con.length + 1);
                con[con.length - 1] = conjunto.con[i];
                terminado = true;
            }
        }
        return terminado;
    }

    public Boolean eliminarElemento(Integer elemento) {
        int indiceBusqueda = 0;
        
        while (indiceBusqueda < con.length && con[indiceBusqueda] != elemento) {
            indiceBusqueda++;
        }
        if (indiceBusqueda == con.length) {
            System.out.println("No existe " + elemento + " dentro del conjunto");
            return false;
        } else {
            con = Arrays.copyOf(con, con.length + 1);
            for (int i = indiceBusqueda; i < con.length - 1; i++) {
                con[i] = con[i + 1];
            }
            con = Arrays.copyOf(con, con.length - 2);
            return true;
        }

    }

    public Boolean eliminarConjunto(Conjunto conjunto) {
        int indiceBusqueda = 0;
        boolean conjuntoEliminado = false;
        if (con.equals(conjunto.con)) {
            System.out.println("Los dos conjuntos son iguales");
            return false;
        } else {
            for (int i = 0; i < con.length; i++) {
                while (indiceBusqueda < con.length && con[indiceBusqueda] != conjunto.con[i]) {
                    indiceBusqueda++;
                }
                if (indiceBusqueda == con.length) {
                    System.out.println("No existe " + conjunto.con[i] + " dentro del conjunto");
                } else {
                    for (int j = indiceBusqueda; j < con.length - 1; j++) {
                        con[j] = con[j + 1];
                    }
                    con = Arrays.copyOf(con, con.length - 1);
                    conjuntoEliminado = true;
                }
            }
        }
        return conjuntoEliminado;

    }

    public Boolean pertenece(Integer elemento) {
        boolean pertenece = false;
        for (int i = 0; i < con.length; i++) {
            if (con[i] == elemento) {
                pertenece = true;
            } else {
                pertenece = false;
            }
        }
        return pertenece;
    }

    public int perteneceIndice(Integer elemento) {
        int pertenece = -1;
        for (int i = 0; i < con.length; i++) {
            if (con[i] == elemento) {
                pertenece = i;
            } else {
                pertenece = -1;
            }
        }
        return pertenece;
    }

    public void mostrar() {
        System.out.print("[ ");
        for (Integer e : con) {
            System.out.print(e + " ");
        }
        System.out.print("]\n");
    }

}