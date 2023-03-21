import java.util.Arrays;
import java.util.Random;

public class Colores {
    String[] colores = { "azul", "rojo", "verde", "amarillo", "naranja", "gris", "blanco", "negro" };

    Colores(){

    }

    public void añadirColores(String nuevoColor) {
        colores = Arrays.copyOf(colores, colores.length + 1);
        colores[colores.length - 1] = nuevoColor;
    }

    public String[] getColoresAleatorios(int numeroColores) {
        String[] coloresAleatorios = new String[numeroColores];
        int[] indicesRepetidos = new int[0];
        for (int i = 0; i < numeroColores; i++) {

            int indexColor = getIndiceAleatorio(colores.length-1);
            while (comprobarRepetidos(indicesRepetidos, coloresAleatorios) == true) {
                indexColor = getIndiceAleatorio(colores.length-1);
            }
            coloresAleatorios[i] = colores[indexColor];
            indicesRepetidos = Arrays.copyOf(indicesRepetidos, indicesRepetidos.length + 1);
            indicesRepetidos[indicesRepetidos.length - 1] = indexColor;
        }
        return coloresAleatorios;
    }

    public int getIndiceAleatorio(int max) {
        int num=(int)Math.floor(Math.random()*(max-0+1)+(0));
        return num;
    }

    public boolean comprobarRepetidos(int[] indicesRepetidos, String[] coloresAleatorios) {
        for (int i = 0; i < indicesRepetidos.length; i++) {
            if (indicesRepetidos[i] == coloresAleatorios[i].hashCode()) {
                return true;
            }
        }
        return false;
    }

}
