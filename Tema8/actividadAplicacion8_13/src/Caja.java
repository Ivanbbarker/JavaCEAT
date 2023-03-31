public class Caja {
    int ancho, alto, fondo;
    Unidad unidad;
    String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    double getVolumen() {
        return ancho * alto * fondo;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String toString() {
        return "[Ancho: " + ancho + " Alto: " + alto + " Fondo: " + fondo + " Volumen: " + getVolumen() + "Etiqueta: "
                + etiqueta + " ]";
    }

}
