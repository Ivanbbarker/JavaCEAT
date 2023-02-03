import jva.util.Scanner;

public class ejercicioPIRAMIDE {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Introduce el numero de filas: ");
        int nFilas = sc.nextInt();
        
        
        for (int filas = 0; filas < nFilas; filas++) {
            for (int espacios = 0; espacios <  nFilas-(filas+1); espacios++) {
                System.out.print(" ");
            }
            for (int aster = 0; aster <= filas; aster++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}
