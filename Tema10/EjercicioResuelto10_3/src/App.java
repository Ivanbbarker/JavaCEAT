import java.io.FileReader;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "";
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("C:/Users/JAVA/Desktop/Tema10/EjercicioResuelto10_3/src/Main.java"));
            String linea = in.readLine();
            while (linea != null) {
                texto = texto + linea + '\n';
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }  finally {
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
        
        System.out.println(texto);
    }
}
