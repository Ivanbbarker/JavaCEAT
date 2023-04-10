import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Introducir edad: ");
            int edad = new Scanner(System.in).nextInt();
            if (edad < 0) {
                throw new ExcepcionEdadNegativa();
            } else {
                System.out.println("edad correcta: "+ edad);
            }
        } catch (ExcepcionEdadNegativa e) {
            System.out.println(e);
        }
    }
}