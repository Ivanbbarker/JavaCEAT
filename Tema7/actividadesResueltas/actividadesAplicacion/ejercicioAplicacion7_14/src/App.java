import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Introduce el importe a pagar: ");
        double importe = sc.nextDouble();
        Importe factura = new Importe(precio-importe);
        factura.calcular();
    }
}
