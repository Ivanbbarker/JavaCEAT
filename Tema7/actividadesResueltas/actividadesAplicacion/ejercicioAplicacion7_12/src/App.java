import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de A: ");
        int A = sc.nextInt();
        System.out.print("Introduce el valor de B: ");
        int B = sc.nextInt();
        System.out.print("Introduce el valor de C: ");
        int C = sc.nextInt();
        Ecuacion ecuacion = new Ecuacion(A, B, C);
        ecuacion.mostrarEcuacion();
        System.out.println("El discriminante es: "+ecuacion.realizarDiscriminante(A, B, C));
        ecuacion.ecuacionSegundoGrado(A, B, C);
    }
}
