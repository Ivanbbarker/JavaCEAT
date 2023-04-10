import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader lectura = null;
        String texto = "";
        String nombre = pedirNombreFichero();
        String path = "C:/Users/JAVA/Desktop/Tema10/ActividadResuelta10_11/" + nombre;
        nombre = existeArchivo(path);
        try {
            lectura = new BufferedReader(new FileReader(nombre));
            String linea = lectura.readLine();
            while (linea != null) {
                texto = texto + linea + '\n';
                linea = lectura.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (lectura != null) {
                try {
                    lectura.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println(texto);

    }

    public static String pedirNombreFichero() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.print("Introduce el nombre del archivo (sin la extension): ");
        nombre = sc.next();
        return nombre + ".txt";
    }

    public static String existeArchivo(String path){
        File fichero = new File(path);
        if (fichero.exists()) {
            return path;
        } else {
            return "C:/Users/JAVA/Desktop/Tema10/ActividadResuelta10_11/prueba.txt";
        }
    }
}
