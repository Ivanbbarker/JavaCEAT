public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazar(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void desplazarX(double dx) {
        x += dx;
    }

    public void desplazarY(double dy) {
        y += dy;
    }

    public double distanciaEuclidea(Punto otro){
        return Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
    }

    public void muestra(){
        System.out.println(x + " " + y);
    }
}
