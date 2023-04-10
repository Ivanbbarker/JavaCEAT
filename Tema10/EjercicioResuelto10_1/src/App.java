import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer numero = leerEntero();
    }


    static Integer leerEntero(){
        Integer resultado;
        while(true){
            try {
                System.out.print("Introduce un numero entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tipo erroneo");
            }
        }
        return resultado;
    }

}
