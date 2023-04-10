import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:/Users/JAVA/Desktop/Tema10/EjercicioResuelto10_4ç/src/NumerosReales.txt"));
            String texto = in.readLine();
            String[] subcadendas = texto.split(" ");
            double suma = 0;
            for (int i = 0; i < subcadendas.length; i++) {
                suma += Double.valueOf(subcadendas[i]);
            }
            System.out.println("Suma: " + suma + "\tmedia: " + suma / subcadendas.length);
        } catch (IOException e) {

            System.out.println(e.getMessage());

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
