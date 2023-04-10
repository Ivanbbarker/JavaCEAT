import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter salida = null;
        Boolean fin = false;
        try {
            salida = new BufferedWriter(new FileWriter("texto.txt"));
            do {
                System.out.print("Escriba una nueva linea: ");
                String linea = sc.nextLine();
                if (linea.toLowerCase().equals("fin")) {
                    fin = true;
                    break;
                }
                salida.write(linea);
                salida.newLine();
            } while (!fin);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
