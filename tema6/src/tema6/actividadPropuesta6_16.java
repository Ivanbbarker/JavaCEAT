/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6;

/**
 *
 * @author java
 */
public class ejercicioAplicacion6_16 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        final char conjunto1[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        final char conjunto2[] = {'@', '^', '(', '*', '+', '-', '/', '_', '1', ';', ':', '#', '<', '>', '0', '6', '9', '5', '3', ']', '[', 'ç', '¨', '`', '´', '4'};
        char codificado[];
        String texto;
        System.out.print("Introduzca un texto a codificar: ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();
        codificado = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            codificado[i] = codificar(conjunto1, conjunto2, texto.charAt(i));
            String textoMostrar = String.valueOf(codificado);
            System.out.println(textoMostrar);
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

}
