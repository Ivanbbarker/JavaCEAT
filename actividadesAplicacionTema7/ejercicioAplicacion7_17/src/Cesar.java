public class Cesar {
    int desplazamiento;

    Cesar() {
        desplazamiento = 0;
    }

    public int getDesplazamiento() {
        return this.desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public String cifrado(String cadenaOriginal) {

        final int LONGITUD_ALFABETO = 26, INICIO_MINUSCULAS = 97, INICIO_MAYUSCULAS = 65;
        String cadenaRotada = "";
        for (int x = 0; x < cadenaOriginal.length(); x++) {
            char caracterActual = cadenaOriginal.charAt(x);
            if (!Character.isLetter(caracterActual)) {
                cadenaRotada += caracterActual;
                continue;
            }

            int codigoAsciiDeCaracterActual = (int) caracterActual;
            boolean esMayuscula = Character.isUpperCase(caracterActual);
            int nuevaPosicionEnAlfabeto = ((codigoAsciiDeCaracterActual
                    - (esMayuscula ? INICIO_MAYUSCULAS : INICIO_MINUSCULAS)) + desplazamiento) % LONGITUD_ALFABETO;

            if (nuevaPosicionEnAlfabeto < 0)
                nuevaPosicionEnAlfabeto += LONGITUD_ALFABETO;
            int nuevaPosicionAscii = (esMayuscula ? INICIO_MAYUSCULAS : INICIO_MINUSCULAS) + nuevaPosicionEnAlfabeto;
            cadenaRotada += Character.toString((char) nuevaPosicionAscii);
        }
        return cadenaRotada;
    }

    public void cifradoInverso(String cadenaOriginal ) {
        final int LONGITUD_ALFABETO = 26, INICIO_MINUSCULAS = 97, INICIO_MAYUSCULAS = 65;
        String cadenaRotada = "";
        for (int x = 0; x < cadenaOriginal.length(); x++) {
            char caracterActual = cadenaOriginal.charAt(x);
            if (!Character.isLetter(caracterActual)) {
                cadenaRotada += caracterActual;
                continue;
            }

            int codigoAsciiDeCaracterActual = (int) caracterActual;
            boolean esMayuscula = Character.isUpperCase(caracterActual);
            int nuevaPosicionEnAlfabeto = ((codigoAsciiDeCaracterActual
                    - (esMayuscula ? INICIO_MAYUSCULAS : INICIO_MINUSCULAS)) + (-desplazamiento)) % LONGITUD_ALFABETO;

            if (nuevaPosicionEnAlfabeto < 0)
                nuevaPosicionEnAlfabeto += LONGITUD_ALFABETO;
            int nuevaPosicionAscii = (esMayuscula ? INICIO_MAYUSCULAS : INICIO_MINUSCULAS) + nuevaPosicionEnAlfabeto;
            cadenaRotada += Character.toString((char) nuevaPosicionAscii);
        }
        System.out.println("El mensaje cifrado es: " + cadenaRotada);
    }

}
