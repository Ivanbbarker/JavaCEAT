/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema6;

/**
 *
 * @author java
 */
public class Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u" + xxxx +" : "+ (char) codePoint);
        }
    }
    
}
