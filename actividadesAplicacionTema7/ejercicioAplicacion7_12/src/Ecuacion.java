public class Ecuacion {
    public double A;
    public double B;
    public double C;

    public double getA() {
        return this.A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return this.B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return this.C;
    }

    public void setC(double C) {
        this.C = C;
    }

    public Ecuacion(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double realizarDiscriminante(double A, double B, double C) {
        double D;
        D = B * B - 4 * A * C;
        if (D > 0) {
            //System.out.println("El discriminante es: " + D);
            System.out.println("Exisiste una solucion");
            return D;
        } else if (D == 0) {
            //System.out.println("El discriminante es: " + D);
            System.out.println("Existe 1 solucion");
            return D;
        } else if (D < 0) {
            System.out.println("No existe ninguna solucion");
            return -1;
        }
        return -1;
    }

    public void ecuacionSegundoGrado(double A, double B, double C) {
        if (realizarDiscriminante(A, B, C) > 0) {
            ecuacionSegundoGradoPositiva(A, B, C);
            ecuacionSegundoGradoNegativa(A, B, C);
        } else if (realizarDiscriminante(A, B, C) == 0) {
            ecuacionSegundoGradoPositiva(A, B, C);
        } else {
            System.out.println("No existe ninguna solucion.");
        }
    }

    public void ecuacionSegundoGradoPositiva(double A, double B, double C) {
        double raiz;
        raiz = (-B + Math.sqrt(realizarDiscriminante(A, B, C))) / 2 * A;
        System.out.println("La R1 (Raiz 1) es: " + raiz);
    }

    public void ecuacionSegundoGradoNegativa(double A, double B, double C) {
        double raiz;
        raiz = (-B - Math.sqrt(realizarDiscriminante(A, B, C))) / 2 * A;
        System.out.println("La R2 (Raiz 2) es: " + raiz);
    }

    public void mostrarEcuacion() {
        System.out.println(A + "x^2 + " + B + "x + " + C + " = 0");
    }
}
