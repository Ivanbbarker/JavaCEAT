import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedWriter escritura = null;
        FileInputStream flujo = null;
        Scanner sc = new Scanner(System.in);
        String[] firmas = new String[0];
        try {

            BufferedReader br = new BufferedReader(new FileReader("firmas.txt"));
            sc = new Scanner(br);
            while (sc.hasNext()) {
                String firmados = sc.next();
                firmas = Arrays.copyOf(firmas, firmas.length + 1);
                System.arraycopy(firmas, 0, firmas, 1, firmas.length - 1);
                firmas[firmas.length - 1] = firmados;
            }
            System.out.println(Arrays.toString(firmas));
            // ESCRIBE LOS DATOS CORRESPONDIENTES
            escritura = new BufferedWriter(new FileWriter("firmas.txt", true));
            String firma = pedirDatos(sc);
            escritura.write(firma);
            escritura.newLine();
            // COMPROBAMOS SI LOS DATOS YA CORRESPONDEN AL LIBRO

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (escritura != null) {
                try {
                    escritura.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static boolean existeFirma() {
        boolean existe = false;

        return existe;
    }

    public static String pedirDatos(Scanner sc) {
        System.out.print("Introduce el nombre de tu firma: ");
        String firma = sc.nextLine();
        return firma;
    }

}
