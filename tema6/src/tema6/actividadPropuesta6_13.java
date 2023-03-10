package tema6;

import java.util.Scanner;

/**
 *
 * @author java
 */
public class actividadPropuesta6_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un trozo de codigo en C, con comentarios: ");
        String codigo = sc.nextLine();
        codigo = eliminaComentarios(codigo);
        System.out.println(codigo);
    }

    public static String eliminaComentarios(String codigo) {
        String codigoNuevo = "";

        for (int i = 0; i < codigo.length(); i++) {
            if (codigo.charAt(i) == '/' || codigo.charAt(i + 1) == '*') {
                int posiciones = codigo.lastIndexOf('/', i);
                i = posiciones;
            } else {
                codigoNuevo = codigoNuevo + codigo.charAt(i);
            }

        }

        return codigoNuevo;
    }

}
