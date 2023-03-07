
package tema6;

/**
 *
 * @author java
 */
public class actividadPropuesta6_11 {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char codificado[];
        String texto;
        System.out.print("Introduzca un texto a codificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();
        codificado = new char[texto.length()];
        
        for (int i = 0; i < texto.length(); i++) {
            codificado[i] =codificar(conjunto1, conjunto2, texto.charAt(i));
        }
        
        texto = String.valueOf(codificado);
        System.out.println(texto);
        
        for (int i = 0; i < texto.length(); i++) {
            codificado[i] =desCodificar(conjunto1, conjunto2, texto.charAt(i));
        }
        texto = String.valueOf(codificado);
        System.out.println(texto);
        
    }

    public static char codificar(char conjunto1[], char conjunto2[], char c) {
        final String conj1 = String.valueOf(conjunto1);
        char codificado;
        int pos = conj1.indexOf(c);
        if (pos == -1) {
            codificado = c;
        } else {
            codificado = conjunto2[pos];
        }
        return codificado;
    }
    
      public static char desCodificar(char conjunto1[], char conjunto2[], char c) {
        final String conj2 = String.valueOf(conjunto2);
        char codificado;
        int pos = conj2.indexOf(c);
        if (pos == -1) {
            codificado = c;
        } else {
            codificado = conjunto1[pos];
        }
        return codificado;
    }

}
