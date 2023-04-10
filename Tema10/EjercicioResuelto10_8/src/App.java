import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el nombre del fichero: ");
        String fichOriginal = sc.nextLine();
        String fichcopia = "copia_de_" + fichOriginal;

        try (BufferedReader in = new BufferedReader(new FileReader(fichOriginal));
                BufferedWriter out = new BufferedWriter(new FileWriter(fichcopia))) {
            int c = in.read();
            while (c != -1) {
                out.write(c);
                c = in.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
