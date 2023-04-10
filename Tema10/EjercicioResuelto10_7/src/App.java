import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("quijote.txt"));
            String cad = "En un lugar de la mancha,";
            out.write(cad);
            cad = "de cuyo nombre no quiero acordarme.";
            out.newLine();
            out.write(cad);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
