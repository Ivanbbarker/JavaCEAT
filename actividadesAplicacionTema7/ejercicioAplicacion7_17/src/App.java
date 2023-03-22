import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cesar c = new Cesar();
        System.out.print("Introduce el numero de desplazamiento para el cifrado: ");
        int desplazamiento = sc.nextInt();
        System.out.print("Introduce una frase que cifrar: ");
        String cadena = sc.nextLine();
        c.setDesplazamiento(desplazamiento);
        System.out.println(c.cifrado(cadena));
        c.cifradoInverso(c.cifrado(cadena));
    }
}
