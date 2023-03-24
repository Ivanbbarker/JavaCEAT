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
        int pertenece = 0;
        for (int i = 0; i < con.length; i++) {
            if (con[i] == elemento) {
                pertenece++;
            }
        }
        if (pertenece == 1) {
            return true;
        } else {
            return false;
        }

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

    public boolean incluido(Conjunto c1, Conjunto c2) {
        int objetivo;
        boolean incluido = false;
        if (c1.con.length > c2.con.length) {
            objetivo = 0;
            for (int i = 0; i < c2.con.length; i++) {
                for (int j = 0; j < c1.con.length; j++) {
                    if (c1.con[j] == c2.con[i]) {
                        objetivo++;
                    }
                }
            }
            if (objetivo == c2.con.length) {
                incluido = true;
            }
        } else {
            objetivo = 0;
            for (int i = 0; i < c1.con.length; i++) {
                for (int j = 0; j < c2.con.length; j++) {
                    if (c2.con[j] == c1.con[i]) {
                        objetivo++;
                    }
                }
            }
            if (objetivo == c1.con.length) {
                incluido = true;
            }
        }
        return incluido;
    }

    public Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto union = new Conjunto();
        union.add(c1);
        for (int i = 0; i < c2.con.length; i++) {
            if (!union.pertenece(c2.con[i])) {
                union.add(c2.con[i]);
            }
        }
        return union;
    }

    public Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto interseccion = new Conjunto();
        if (c1.con.length > c2.con.length) {
            for (int i = 0; i < c1.con.length; i++) {
                if (c1.pertenece(c2.con[i])) {
                    interseccion.add(c2.con[i]);
                }
            }
        } else {
            for (int i = 0; i < c2.con.length; i++) {
                if (c2.pertenece(c1.con[i])) {
                    interseccion.add(c1.con[i]);
                }
            }
        }
        return interseccion;
    }

    public Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto diferencia = new Conjunto();
        for (int i = 0; i < c1.con.length; i++) {
            int coincidendia = 0;
            for (int j = 0; j < c2.con.length; j++) {
                if (c1.con[i] == c2.con[j]) {
                    coincidendia++;
                }
            }
            if (coincidendia == 0) {
                diferencia.add(c1.con[i]);
            }
        }
        return diferencia;
    }
}